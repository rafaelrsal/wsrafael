package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.dao.ArtistaDAO;
import br.com.projetofinal.modelo.Artista;
//import br.com.projetofinal.modelo.Usuario;
import br.com.projetofinal.modelo.Usuario;

@RestController //aponta para o SPRINGBOOT que esta classe responderá ao HTTP
@CrossOrigin("*") //Libera o acesso externo de todos.
public class ArtistaController {

	@Autowired //Indica para o SPRING que é ele que vai gerenciar o DAO
	private ArtistaDAO dao;
	
	//-----------------METODO POST-------------------------------------------------
			
		@PostMapping("/novoartista") //METODO que responde ao método POST informando a ROTA que deverá ser informada para a aplicação WEB para CADASTRO de Usuario
		public ResponseEntity<Artista> addArtista(@RequestBody Artista objeto) //Vai retornar um Usuario e RECEBE um usuario
		{
			try
			{
				dao.save(objeto); //SALVA O OBJETO NO BANCO
				return ResponseEntity.ok(objeto); //RESPONDE 200 OK E RETORNA O OBJETO
			}
			catch (Exception e)
			{
				e.printStackTrace();
				return ResponseEntity.status(403).build();
			}
			
			
		}
		
		@PostMapping("/buscaartista") //METODO que responde ao método POST informando a ROTA que deverá ser informada para a aplicação WEB para CADASTRO de Usuario
		public ResponseEntity<Artista> getArtista(@RequestBody Artista objeto) //Vai retornar um Usuario
		{
			Artista resposta = dao.findById(objeto.getId()).orElse(null);
			if (resposta==null)
			{
				return ResponseEntity.status(404).build();
				//Se não encontrar um artista, ele devolve o erro 404
			}
			return ResponseEntity.ok(resposta); //Retorna OK e o Objeto
					
		}
		
		@PostMapping("/buscapornacionalidade") //METODO que responde ao método POST informando a ROTA que deverá ser informada para a aplicação WEB para CADASTRO de Usuario
		public ResponseEntity<List<Artista>> getNacionalidade(@RequestBody Artista objeto) //Vai retornar um Usuario
		{
			List<Artista> lista = (List<Artista>)dao.findByNacionalidadeLike(objeto.getNacionalidade() + "%");
			if (lista.size() == 0)
			{
				return ResponseEntity.status(404).build();
				//Se não encontrar um artista, ele devolve o erro 404
			}
			return ResponseEntity.ok(lista); //Retorna OK e o Objeto
					
		}
		
		@PostMapping("/excluiartista") //METODO que responde ao método POST informando a ROTA que deverá ser informada para a aplicação WEB para CADASTRO de Usuario
		public ResponseEntity<Boolean> removeArtista(@RequestBody Artista objeto) //Vai retornar um Usuario
		{
			Artista resposta = dao.findById(objeto.getId()).orElse(null);
			if (resposta==null)
			{				
				return ResponseEntity.status(404).build();
				//Se não encontrar um artista, ele devolve o erro 404
			}
			dao.deleteById(objeto.getId());
			return ResponseEntity.ok(true); //Retorna OK e o Objeto
					
		}
		
		//-----------------METODO GET-------------------------------------------------
		
		@GetMapping("/artistas") //METODO que responde ao método GET informando a ROTA que deverá ser informada  para a aplicação WEB para CONSULTA de Usuario
		public ResponseEntity<List<Artista>> getAll() //Retorna um RESPONSEENTITY contendo o codigo de RETORNO e a LISTA de usuário
		{
			List<Artista> lista = (List<Artista>) dao.findAll(); //Cria uma lista e preenche com os artistas re-
			//tornados do findAll do DAO (com casting para o tipo LIST, uma vez que retorna o ITERABLE)
			
			if(lista.size() > 0)
			{
				return ResponseEntity.ok(lista); //Se existirem usuarios na lista, retorna a lista
			}
			else
			{
				return ResponseEntity.status(404).build(); //Se não encontrar nada, retorna o 404
			}
					
		}
}
