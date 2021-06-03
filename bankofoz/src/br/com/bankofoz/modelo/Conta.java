package br.com.bankofoz.modelo;

public class Conta {
	
	private int numero;
	private double saldo;
	private Cliente cliente;
	private Agencia agencia;
	
	//CONSTRUTOR
	
	public Conta() {
		super();
	}

	public Conta(int numero, double saldo, Cliente cliente, Agencia agencia) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
		this.agencia = agencia;
	}

	//GETTERS and SETTERS
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + ", agencia=" + agencia + "]";
	}
	
	//METODOS CUSTOMIZADOS
	public boolean sacar (double valor)
	{
		if ((this.saldo - valor)>=0)
		{
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean depositar (double valor)
	{
		if (valor > 0)
		{
			this.saldo += valor;
			return true;
		}
		return false;
	}
	
	public String getResumo()
	{
		return "Cliente: "+this.cliente.getNome()+"| Saldo: "+this.saldo;
	}
}
