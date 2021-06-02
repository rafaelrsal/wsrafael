package br.com.unixyz.modelo;

public class Professor {

	private String nomeHorario;
	private String formacao;
	private int cargaHoraria;
	private double valorHora;
	private Endereco endereco;
		
	
	public Professor() {
		super();
	}

	public Professor(String nomeHorario, String formacao, int cargaHoraria, double valorHora, Endereco endereco) {
		super();
		this.nomeHorario = nomeHorario;
		this.formacao = formacao;
		this.cargaHoraria = cargaHoraria;
		this.valorHora = valorHora;
		this.endereco = endereco;
	}

	public String getNomeHorario() {
		return nomeHorario;
	}

	public void setNomeHorario(String nomeHorario) {
		this.nomeHorario = nomeHorario;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Professor [nomeHorario=" + nomeHorario + ", formacao=" + formacao + ", cargaHoraria=" + cargaHoraria
				+ ", valorHora=" + valorHora + ", endereco=" + endereco + "]";
	}
	
	
	
}
