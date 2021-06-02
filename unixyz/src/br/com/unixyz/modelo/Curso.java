package br.com.unixyz.modelo;

public class Curso {

	private String nome;
	private String titulacao;
	private double valor;
	private int cargaHoraria;
	
	
	public Curso() {
		super();
	}

	public Curso(String nome, String titulacao, double valor, int cargaHoraria) {
		super();
		this.nome = nome;
		this.titulacao = titulacao;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", titulacao=" + titulacao + ", valor=" + valor + ", cargaHoraria="
				+ cargaHoraria + "]";
	}
	
	
	
}
