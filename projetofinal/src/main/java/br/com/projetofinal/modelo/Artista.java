package br.com.projetofinal.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //indica para o SPRINGBOOT que essa CLASSE terá uma tabela especifica no banco de dados
@Table(name="TB_ARTISTA") //indica qual tabela estará ligada com a classe
public class Artista {

	@GeneratedValue(strategy=GenerationType.IDENTITY) //identifica para SPRINGBOOT um campo de autoincremento
	@Id 				//indica para o SPRINGBOOT que este campo é uma CHAVE PRIMARIA
	@Column(name="id_artista")
	private int id;
	
	@Column(name="nome_artista")
	private String nomeArtistico;
	
	@Column(name="nacionalidade_artista")
	private String nacionalidade;
	
	@Column(name="estilo_artista")
	private String estilo;
		
	public Artista() {
		super();
	}
	
	public Artista(int id, String nomeArtistico, String nacionalidade, String estilo) {
		super();
		this.id = id;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
		this.estilo = estilo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeArtistico() {
		return nomeArtistico;
	}
	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	
}
