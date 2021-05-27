package br.com.caicaielevator.modelo;

public class Elevador {

	private String nome;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int qtdePessoas;
	private int andarAtual;
	
	
	public String retornarNome()
	{
		
		return nome;
	}
	
	public void preencherNome (String param)
	{
		nome = param;
	}
	
	public void inicializar (int pAndarMax, int pAndarMin, int pCapPessoas)
	{
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas = pCapPessoas;
	}
	
	public String retornarResumo()
	{
		return "Nome: " +nome+ "| Andar Atual: "+andarAtual+"| Quantidade de pessoas: "+qtdePessoas;
	}
	
	public String subir()
	{
		if (andarAtual < andarMaximo)
		{
			andarAtual ++;
			return "Subindo";
		}
		//ou PODE COLOCAR O return do ELSE fora do ELSE (sem ELSE)
		else
		{
			return "Ja esta no último andar";
		}
	}
	
	public String descer()
	{
		if (andarAtual > andarMinimo)
		{
			andarAtual --;
			return "Descendo";
		}
		else
		{
			return "Ja está no andar mínimo";
		}
	}
	
	public void entrar (int qtde)
	{
		if ((qtdePessoas + qtde) < capacidadePessoas)
		{
			qtdePessoas += qtde;
		}
	}
	
	public void sair (int qtde)
	{
		if ((qtdePessoas-qtde) > 0)
		{
			qtdePessoas -= qtde;
		}
	}
	
	public void sair()
	{
		if (qtdePessoas > 0)
		{
			qtdePessoas --;
		}
	}
}
