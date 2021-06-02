package br.com.unixyz.modelo;

public class Aluno {

	private int rm;
	private Endereco endereco;
	
	
	public Aluno() {
		super();
	}

	public Aluno(int rm, Endereco endereco) {
		super();
		this.rm = rm;
		this.endereco = endereco;
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Aluno [rm=" + rm + ", endereco=" + endereco + "]";
	}
	
	
	
	
}
