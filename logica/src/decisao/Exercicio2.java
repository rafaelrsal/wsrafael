package decisao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int diarias = Integer.parseInt(JOptionPane.showInputDialog("Diarias: "));
		double valordiaria = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
		
		double taxa = 0;
		
		if (diarias < 5)
		{
			taxa = 0.1;			
		}
		else if (diarias >= 5 && diarias <= 10)
		{
			taxa = 0.08;			
		}
		else
		{
			taxa = 0.05;
		}
		
		double valortotal = (((double)diarias*valordiaria)*taxa)+((double)diarias*valordiaria);
		System.out.printf("Valor total da estadia (TAXA aplicada: %.2f ): R$ %.2f",taxa,valortotal);
	}
}
