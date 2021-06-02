package br.com.lojaregina.modelo;

public class Colaborador {

	private int id;
	private String nome;
	private Endereco endereco;
	private String cargo;
	private double salario;	
	
	
	public Colaborador() {
		super();
	}

	public Colaborador(int id, String nome, Endereco endereco, String cargo, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cargo = cargo;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Colaborador [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", cargo=" + cargo + ", salario="
				+ salario + "]";
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setAll(int id, String nome, Endereco endereco, String cargo, double salario)
	{
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	
	
}
