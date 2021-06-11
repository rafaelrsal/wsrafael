package br.com.projetofinal.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@Entity //indica para o SPRINGBOOT que essa CLASSE terá uma tabela especifica no banco de dados
//@Table(name="TB_EQUIPAMENTO") //indica qual tabela estará ligada com a classe
public class Equipamento {

	@GeneratedValue(strategy=GenerationType.IDENTITY) //identifica para SPRINGBOOT um campo de autoincremento
	@Id 				//indica para o SPRINGBOOT que este campo é uma CHAVE PRIMARIA
	@Column(name="id_equipamento")
	private int id;
	
	@Column(name="hostname_equipamento", length=30)
	private String hostname;
	
	@Column(name="ip_equipamento", length=30)
	private String ip;
	
	
	@JsonIgnoreProperties("equipamento")
	@OneToMany(cascade=CascadeType.ALL, mappedBy="equipamento") //Indico que o Artista pode ter muitas musicas 
	private List<Evento> eventos;
	
		
	public Equipamento() {
		super();
	}


	public Equipamento(int id, String hostname, String ip) {
		super();
		this.id = id;
		this.hostname = hostname;
		this.ip = ip;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getHostname() {
		return hostname;
	}


	public void setHostname(String hostname) {
		this.hostname = hostname;
	}


	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
}
