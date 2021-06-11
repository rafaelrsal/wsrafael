package br.com.projetofinal.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@Entity //indica para o SPRINGBOOT que essa CLASSE terá uma tabela especifica no banco de dados
//@Table(name="TB_ALARME") //indica qual tabela estará ligada com a classe
public class Alarme {

	@GeneratedValue(strategy=GenerationType.IDENTITY) //identifica para SPRINGBOOT um campo de autoincremento
	@Id 				//indica para o SPRINGBOOT que este campo é uma CHAVE PRIMARIA
	@Column(name="id_alarme")
	private int id;
	
	@Column(name="nome_alarme", length=30)
	private String nome;
	
	@Column(name="descricao_alarme", length=100)
	private String descricao;
	
	@JsonIgnoreProperties("alarme")
	@OneToMany(cascade=CascadeType.ALL, mappedBy="alarme") //Indico que o Artista pode ter muitas musicas 
	private List<Evento> eventos;
	
	public Alarme() {
		super();
	}

	public Alarme(int id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
