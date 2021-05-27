package br.com.rubinhocar.implementacao;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {

		Veiculo objeto = new Veiculo();
		objeto.preencherModelo("camaro");
		
		System.out.println("Modelo: "+objeto.retornarModelo());
		
		objeto.preencherValor(200000);
		System.out.println(objeto.retornaTudo());
		System.out.println(objeto.ligar());
		objeto.acelerar(20);
		objeto.acelerar(10);
		objeto.desacelerar(15);
		System.out.println(objeto.retornaTudo());
		objeto.desligar();
		
		System.out.println(objeto.retornaTudo());
					
	}

}
