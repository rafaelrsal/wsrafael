package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> lista = new HashSet<String>();
		
		lista.add("DBA");
		lista.add("Estagiário");
		lista.add("Analista");
		lista.add("Dev");
		lista.add("DBA");
		System.out.println(lista);
		
		//SET NÃO ACEITA ELEMENTOS IDENTICOS
			//(LISTA ACEITA)
		
		//De acordo com os caracteres digitados, ele faz um CALCULO e gera um endereço de memória.
		
		//foreach
		for(String cargo : lista) //: representa "DENTRO DE"
		{
			System.out.println("Cargo: "+cargo);
		}
	}

}
