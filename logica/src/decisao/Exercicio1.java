package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor1: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor2: "));
		char operador = JOptionPane.showInputDialog("Operador matem?tico [+ ou - ou / ou *]: ").charAt(0);
		
		if (operador == '+')
		{
			System.out.println("Opera??o escolhida: SOMA");
			int resultado = valor1+valor2;
			System.out.println("Resultado: " + resultado);
		}else if (operador == '-')
		{
			System.out.println("Opera??o escolhida: SUBTRA??O");
			int resultado = valor1-valor2;
			System.out.println("Resultado: " + resultado);
		}else if (operador == '*')
		{
			System.out.println("Opera??o escolhida: MULTIPLICA??O");
			int resultado = valor1*valor2;
			System.out.println("Resultado: " + resultado);	
		}else if (operador == '/')
		{
			System.out.println("Opera??o escolhida: DIVIS?O");
			double resultado = (double)valor1/(double)valor2;
			System.out.println("Resultado: " + resultado);
		}
		else
		{
			System.out.println("O Operador escolhido n?o ? valido");
		}
		
		
	}
}
