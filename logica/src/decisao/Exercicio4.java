package decisao;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo valor: "));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Terceiro valor: "));
		int valores[] = new int[3];
	
		
		if (valor1 == valor2 || valor2 == valor3 || valor1 == valor3)
		{
			System.out.println("Os valores precisam ser diferentes");			
		}
		else
		{
			if (valor1 > valor2 && valor1 > valor3 && valor3 > valor2)
			{
				valores[0] = valor2;
				valores[1] = valor3;
				valores[2] = valor1;
			}
			else if (valor1 > valor2 && valor1 > valor3 && valor3 < valor2)
			{
				valores[0] = valor3;
				valores[1] = valor2;
				valores[2] = valor1;
			}			
			else if (valor1 < valor2 && valor1 < valor3 && valor3 < valor2)
			{
				valores[0] = valor1;
				valores[1] = valor3;
				valores[2] = valor2;
			}
			else if (valor1 < valor2 && valor1 > valor3 && valor3 < valor2)
			{
				valores[0] = valor3;
				valores[1] = valor1;
				valores[2] = valor2;
			}
			else if (valor1 < valor2 && valor1 < valor3 && valor3 > valor2)
			{
				valores[0] = valor1;
				valores[1] = valor2;
				valores[2] = valor3;
			}	
			else if (valor1 > valor2 && valor1 < valor3 && valor3 > valor2)
			{
				valores[0] = valor2;
				valores[1] = valor1;
				valores[2] = valor3;
			}	
			
			
			System.out.printf("Valores em ordem: \n1� =>%d\n2� =>%d\n3� =>%d", valores[0], valores[1], valores[2]);			
			
		}
	}
}
