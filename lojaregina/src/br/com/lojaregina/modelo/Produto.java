package br.com.lojaregina.modelo;

public class Produto {
	
	private int id;
	private String descricao;
	private double valorCompra;
	private double valorVenda;
	private int qtde;
		
	
	public Produto() {
		super();
	}

	public Produto(int id, String descricao, double valorCompra, double valorVenda, int qtde) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.qtde = qtde;
	}

	public void setAll(int id, String descricao, double valorCompra, double valorVenda, int qtde)
	{
		this.id = id;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.qtde = qtde;
	}
	
	public String toString()
	{
		return "ID: " +this.id+ "| Descrição: " +this.descricao+ "| Valor-Compra: R$" +this.valorCompra+ "| Valor-Venda: R$" +this.valorVenda;
	}
		
	public double getDesconto()
	{
		//Retorna o valor da venda com 10% de desconto
		return valorVenda - (valorVenda * 0.1);
	}
	
	public double getDesconto (double porc)
	{
		//Retorna o valor da venda com a % de desconto informada pelo usuário
		double desconto = (this.valorVenda * porc)/100;
		return this.valorVenda-desconto;
	}
	
	public double getTotalVenda()
	{
		//Retorna o valor total de venda do estoque
		return this.valorVenda * this.qtde;
	}
	
	public void setAtualizarValores (double porc)
	{
		//Ajustar o valor de venda e compra de acordo com a % recebida
		this.valorVenda = this.valorVenda + ((this.valorVenda * porc)/100);
		this.valorCompra = this.valorCompra + ((this.valorCompra * porc)/100);
	}
	
	public String getVerificarEstoque()
	{
		if (this.qtde > 20)
		{
			return "Estoque alto: "+this.qtde;
		}
		else if(this.qtde >= 10)
		{
			return "Estoque medio: "+this.qtde;
		}
		else
		{
			return "Estoque baixo: "+this.qtde;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	
}
