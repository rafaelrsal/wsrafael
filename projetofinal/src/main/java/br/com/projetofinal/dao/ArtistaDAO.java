package br.com.projetofinal.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.modelo.Artista;

//DAO da classe Artista
public interface ArtistaDAO extends CrudRepository<Artista, Integer> //Herança da Crudrepository com o tipo Artista e chave primaria do tipo INTEGER
{
	public List<Artista> findByNacionalidadeLike(String nacionalidade);
}
