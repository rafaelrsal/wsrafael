package br.com.unixyz.modelo;

public class Pos extends Curso {

	private boolean intercambio;
	private String nivel;
	
		
	public Pos() {
		super();
	}
	

	public Pos(String nome, String titulacao, double valor, int cargaHoraria, boolean intercambio, String nivel) {
		super(nome, titulacao, valor, cargaHoraria);
		this.intercambio = intercambio;
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Pos [intercambio=" + intercambio + ", nivel=" + nivel + ", toString()=" + super.toString() + "]";
	}


	public boolean isIntercambio() {
		return intercambio;
	}


	public void setIntercambio(boolean intercambio) {
		this.intercambio = intercambio;
	}


	public String getNivel() {
		return nivel;
	}


	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	
	
	
	
}
