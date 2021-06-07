package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lista = new ArrayList<String>();
		
		lista.add("DBA");
		lista.add("DEV");
		lista.add("DBA");
		lista.add("Infra");		
		System.out.println(lista);
		System.out.println("Primeiro elemento: "+lista.get(0));
		lista.remove(0);
		System.out.println(lista);
		System.out.println("Primeiro elemento agora: "+lista.get(0));
		
		Collections.sort(lista); //Método SORT da classe COLLECTIONS para ordenar a LISTA
		System.out.println(lista);
		
	}

}
