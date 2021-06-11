package br.com.projetofinal.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.dao.MusicaDAO;
import br.com.projetofinal.modelo.Musica;

@RestController //aponta para o SPRINGBOOT que esta classe responderá ao HTTP
@CrossOrigin("*") //Libera o acesso externo de todos.
public class MusicaController {

	@Autowired
	private MusicaDAO dao;
	
	@PostMapping("/novamusica")
	public ResponseEntity<Musica> addMusica(@RequestBody Musica objeto)
	{
		try
		{
			dao.save(objeto);
			return ResponseEntity.ok(objeto); //Retorna 200 e o objeto
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(403).build(); //Retorna o erro 403
		}
	}
	
	@GetMapping("/musicas")
	public ResponseEntity<List<Musica>> getAll()
	{
		List<Musica> lista = (List<Musica>)dao.findAll();
		
		if (lista.size() == 0)
		{
			return ResponseEntity.status(404).build(); //Retorna o erro 404
		}
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/intervalo/{ini}/{fim}")
	public ResponseEntity<List<Musica>> getIntervalo(@PathVariable String ini, @PathVariable String fim) //usa o @PathVariable para obter as variaveis do Mapping
	{
		try
		{
			SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
			Date inicio = formato.parse(ini);
			Date termino = formato.parse(fim); //converte as datas
			
			List<Musica> lista = dao.findByCadastroBetween(inicio, termino);
			
			if(lista.size() == 0)
			{
				ResponseEntity.status(404).build();
			}
			return ResponseEntity.ok(lista);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}

}
