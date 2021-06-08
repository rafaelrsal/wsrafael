package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.modelo.Usuario;


//DAO (Data Access Object) é um Pattern que consolida os comandos (select, insert, update, delete) contendo o
//CRUD (CREAD READ UPDATE DELETE)

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{

	public Usuario findByEmailAndSenha(String email, String senha);
	
	public Usuario findByRacfAndSenha(String racf, String senha);
	
	public Usuario findByEmail(String email);
	
}
