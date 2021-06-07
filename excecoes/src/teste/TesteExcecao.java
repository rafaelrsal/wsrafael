package teste;

import excecao.MinhaExcecao;

public class TesteExcecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int numero = Integer.parseInt("7");
			System.out.println("Valor: "+ numero);
			
			//String palavra = null;
			//System.out.println("Quantidade de letras: "+palavra.length());
			
			int numeros[] = new int[5];
			numeros[0] = 542;
			numeros[1] = 100;
			numeros[2] = 12;
			System.out.println(numeros[1]);
			
			for (int i=0; i < numeros.length; i++)
			{
				System.out.println("Valor: " + numeros[i]);
			}
			
		}		
		catch (Exception e)
		{
			System.out.println(MinhaExcecao.tratar(e));			
		}
		
	}

}
