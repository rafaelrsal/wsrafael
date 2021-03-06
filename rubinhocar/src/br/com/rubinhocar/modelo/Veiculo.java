package br.com.rubinhocar.modelo;

public class Veiculo {

	private String modelo;
	private double valor;
	private int velocidadeAtual;
	private boolean status;
	
	
	public void preencherModelo (String param)
	{
		if (param.length() < 10)
		{
			//Se o modelo tiver mais que 10 caracteres
			modelo = param;
		}
		
	}
	
	public String retornarModelo ()
	{
		return modelo;		
	}
	
	public void preencherValor(double n)
	{
		valor = n;
	}
	
	public double retornaValor ()
	{
		return valor;
	}
	
	public String ligar()
	{
		status = true;
		return "Ligado";
	}
	
	public String desligar()
	{
		status = false;
		velocidadeAtual = 0;
		return "Desligado";
	}
	
	public void acelerar(int n)
	{
		if (status) 
		{
			velocidadeAtual = velocidadeAtual + n;
		}
	}
	
	public void desacelerar (int n)
	{
		if (status) 
		{
			velocidadeAtual = velocidadeAtual - n;
		}
	}
	
	public void desacelerar ()
	{
		velocidadeAtual = 0;		
	}
	
	public String retornaTudo()
	{
		return "Modelo: "+ modelo + "|Valor: R$" + valor +" |Velocidade Atual: "+ velocidadeAtual +"|Status: "+ status;
	}
}

