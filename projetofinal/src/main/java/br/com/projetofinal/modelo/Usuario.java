package br.com.projetofinal.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //indica para o SPRINGBOOT que essa CLASSE terá uma tabela especifica no banco de dados
@Table(name="TB_USUARIO") //indica qual tabela estará ligada com a classe
public class Usuario {

	@GeneratedValue(strategy=GenerationType.IDENTITY) //identifica para SPRINGBOOT um campo de autoincremento
	@Id 				//indica para o SPRINGBOOT que este campo é uma CHAVE PRIMARIA
	@Column(name="id_usuario")
	private int id;
	
	@Column(name="nome_usuario", length=50)
	private String nome;
	
	@Column(name="email_usuario", length=70)
	private String email;
	
	@Column(name="racf_usuario", length=20)
	private String racf;
	
	@Column(name="senha_usuario", length=20)
	private String senha;
	
	@Column(name="foto_usuario", length=100)
	private String foto;
	
		
	public Usuario() {
		super();
	}
	
	public Usuario(int id, String nome, String email, String senha, String foto) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.foto = foto;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getRacf() {
		return racf;
	}

	public void setRacf(String racf) {
		this.racf = racf;
	}
	
	
}

