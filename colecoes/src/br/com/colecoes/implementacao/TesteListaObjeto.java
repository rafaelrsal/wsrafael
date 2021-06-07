package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.modelo.Cargo;

public class TesteListaObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Cargo> lista = new ArrayList<Cargo>();
		
		lista.add(new Cargo("DBA","Junior",4000));
		lista.add(new Cargo("DEV","Pleno",10000));
		lista.add(new Cargo("ESTAGIARIO","Junior",2500));
		lista.add(new Cargo("ANALISTA","Junior",4500));
		
		System.out.println(lista);
		double total = 0;
		double total_sjunior = 0;
		
		for(Cargo objeto : lista)
		{
			System.out.println("Nome: "+objeto.getNome());
			System.out.println("Nível: "+objeto.getNivel());
			System.out.println("Salário: "+objeto.getSalario());
			total+=objeto.getSalario();
			
			if(objeto.getNivel().equals("Junior"))
			{
				total_sjunior += objeto.getSalario();
			}
		}
		
		System.out.println("Total de Salários: R$"+total);
		System.out.println("Média de Salários: R$" + (total/lista.size()) );
		System.out.println("Total de Salários - JUNIOR: R$" + total_sjunior);
		
	}

}
