package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.dao.UsuarioDAO;
import br.com.projetofinal.modelo.Usuario;

@RestController //aponta para o SPRINGBOOT que esta classe responderá ao HTTP
@CrossOrigin("*") //Libera o acesso externo de todos.
public class UsuarioController {

	
	@Autowired //Indica para o SPRING que é ele que vai gerenciar o DAO
	private UsuarioDAO dao;
	
	//-----------------METODO POST-------------------------------------------------
	
	@PostMapping("/login2")
	public ResponseEntity<Usuario> getLogin2(@RequestBody Usuario objeto) //Vai retornar um Usuario e RECEBE um usuario
	{
		Usuario resposta = dao.findByEmailAndSenha(objeto.getEmail(), objeto.getSenha());
		if (resposta ==null)
		{
			return ResponseEntity.status(403).build(); //Se não achar o usuário retorna o erro 403
		}
		resposta.setSenha("******");
		return ResponseEntity.ok(resposta);  //Se a senha e o usuário recebido forem encontrados na lista, retorna o usuário do BD.
	}
	
	
	@PostMapping("/login") //TELA DE LOGIN
	public ResponseEntity<Usuario> getLogin(@RequestBody Usuario objeto) //Vai retornar um Usuario e RECEBE um usuario
	{
		List<Usuario> lista = (List<Usuario>) dao.findAll(); //PEGA A LISTA DE USUARIOS DO BD e faz o castin para o time LISTA
		
		for (Usuario usuario : lista) //para cada usuario na LISTA
		{
			if (usuario.getEmail().equals(objeto.getEmail()))
			{
				if (usuario.getSenha().equals(objeto.getSenha()))
				{
					usuario.setSenha("******");
					return ResponseEntity.ok(usuario); //Se a senha e o usuário recebido forem encontrados na lista, retorna o usuário do BD.
				}
			}
		}
		return ResponseEntity.status(403).build(); //Se não achar o usuário retorna o erro 403
	}
	
	
	@PostMapping("/novousuario") //METODO que responde ao método POST informando a ROTA que deverá ser informada para a aplicação WEB para CADASTRO de Usuario
	public ResponseEntity<Usuario> addUser(@RequestBody Usuario objeto) //Vai retornar um Usuario e RECEBE um usuario
	{
		try
		{
			dao.save(objeto); //SALVA O OBJETO NO BANCO
			return ResponseEntity.ok(objeto); //RESPONDE 200 OK E RETORNA O OBJETO
		}
		catch (Exception e)
		{
			return ResponseEntity.status(403).build();
		}
		
		
	}
	
	@PostMapping("/usuario") //METODO que responde ao método POST informando a ROTA que deverá ser informada para a aplicação WEB para CADASTRO de Usuario
	public ResponseEntity<Usuario> getUser(@RequestBody Usuario objeto) //Vai retornar um Usuario
	{
		Usuario resposta = dao.findById(objeto.getId()).orElse(null);
		if (resposta==null)
		{
			return ResponseEntity.status(404).build();
			//Se não encontrar um usuário, ele devolve o erro 404
		}
		return ResponseEntity.ok(resposta); //Retorna OK e o Objeto
				
	}
	
	//-----------------METODO GET-------------------------------------------------
	
	@GetMapping("/usuarios") //METODO que responde ao método GET informando a ROTA que deverá ser informada  para a aplicação WEB para CONSULTA de Usuario
	public ResponseEntity<List<Usuario>> getAll() //Retorna um RESPONSEENTITY contendo o codigo de RETORNO e a LISTA de usuário
	{
		List<Usuario> lista = (List<Usuario>) dao.findAll(); //Cria uma lista e preenche com os usuários re-
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
	
	@GetMapping("/usuarioid/{cod}") //A rota contem a variavel que sera usada no método
	public ResponseEntity<Usuario> getUser2(@PathVariable int cod) //Usa a variavel recebida na URL como paramêtro para o SPRINGBOOT
	{
		Usuario resposta = dao.findById(cod).orElse(null);
		if (resposta==null)
		{
			return ResponseEntity.status(404).build();
			//Se não encontrar um usuário, ele devolve o erro 404
		}
		return ResponseEntity.ok(resposta); //Retorna OK e o Objeto
		
	}
}
