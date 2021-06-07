package br.com.bankofoz.modelo;

import br.com.bankofoz.interfaces.PadraoBanco;

public class Agencia implements PadraoBanco{

	private int numero;
	private String nome;
	private String telefone;
	
	
	//CONSTRUTORES
	public Agencia() {
		super();
	}

	public Agencia(int numero, String nome, String telefone) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	//GETTES & SETTERS

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Agencia [numero=" + numero + ", nome=" + nome + ", telefone=" + telefone + "]";
	}

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}	
	
}
