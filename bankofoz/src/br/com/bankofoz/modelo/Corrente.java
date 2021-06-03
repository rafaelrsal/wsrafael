package br.com.bankofoz.modelo;

public class Corrente extends Conta{

	private double limite;
	private double taxa;	
	
	
	//CONSTRUTORES
	
	public Corrente() {
		super();
	}

	public Corrente(int numero, double saldo, Cliente cliente, Agencia agencia, double limite, double taxa) {
		super(numero, saldo, cliente, agencia);
		this.limite = limite;
		this.taxa = taxa;
	}
	
	//GETTERS and SETTERS

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	//METODOS CUSTOMIZADOS
	
	public boolean sacar (double valor)
	{
		if ((super.getSaldo()+this.limite)>valor)
		{
			super.setSaldo(super.getSaldo()-valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo()
	{
		return this.getSaldo()+this.getLimite();
	}
	
	public String getResumo()
	{
		return "RESUMO: TAXA: "+this.taxa+"| Limite: R$"+this.limite+"| Saldo: R$"+super.getSaldo()+"| Cliente: "+super.getCliente().getNome();
	}
}
