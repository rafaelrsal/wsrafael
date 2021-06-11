package br.com.projetofinal.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="TB_MUSICA")
public class Musica {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_musica")
	private int id;
	
	@Column(name="titulo_musica", length=30)
	private String titulo;
	
	@Column(name="cadastro_musica")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	private Date cadastro;
	
	@Column(name="lancamento_musica")
	private int lancamento;
	
	@JsonIgnoreProperties("musicas")
	@ManyToOne
	private Artista artista;
	
	
	public Musica() {
		super();
	}


	public Musica(int id, String titulo, Date cadastro, int lancamento, Artista artista) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.cadastro = cadastro;
		this.lancamento = lancamento;
		this.artista = artista;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Date getCadastro() {
		return cadastro;
	}


	public void setCadastro(Date cadastro) {
		this.cadastro = cadastro;
	}


	public int getLancamento() {
		return lancamento;
	}


	public void setLancamento(int lancamento) {
		this.lancamento = lancamento;
	}


	public Artista getArtista() {
		return artista;
	}


	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	
	
	
}
