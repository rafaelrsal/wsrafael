package br.com.caicaielevator.implementacao;

import br.com.caicaielevator.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Elevador objeto = new Elevador();
		
		System.out.println("Ao iniciar estamos: "+objeto.retornarResumo());
		objeto.preencherNome("Atlas Schneider");
		objeto.inicializar(2, -2, 18);
		System.out.println(objeto.retornarResumo());
		System.out.println(objeto.subir());
		System.out.println(objeto.subir());
		System.out.println(objeto.subir());
		objeto.entrar(18);
		System.out.println(objeto.subir());
		objeto.entrar(5);
		System.out.println(objeto.descer());
		System.out.println(objeto.retornarResumo());
		objeto.entrar(10);
		System.out.println(objeto.descer());
		objeto.sair(20);
		System.out.println(objeto.retornarResumo());
		objeto.sair();
		objeto.sair();
		System.out.println(objeto.descer());
		System.out.println(objeto.descer());
		System.out.println(objeto.descer());
		System.out.println(objeto.retornarResumo());
		System.out.println(objeto.subir());
		objeto.entrar(5);
		System.out.println(objeto.retornarResumo());
		

	}

}
