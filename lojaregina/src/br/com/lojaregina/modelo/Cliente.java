package br.com.lojaregina.modelo;

public class Cliente {
	
	private int id;
	private String nome;
	private String email;
	private String telefone;
	private Endereco endereco;
	
	public Cliente()
	{
		
	}
	
	public Cliente(int id, String nome, String email, String telefone, Endereco endereco)
	{
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	
	public String getUsuario()
	{
		if (email.contains("@"))
		{
			return email.substring(0, email.indexOf("@"));
		}
		return "Email invalido!";
	}
		
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", endereco="
				+ endereco + "]";
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setAll (Endereco endereco, int id, String nome, String email, String telefone)
	{
		this.endereco = endereco;
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
