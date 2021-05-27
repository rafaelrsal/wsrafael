package decisao;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome colaborador: ");
		double salariobruto = Double.parseDouble(JOptionPane.showInputDialog("Salario bruto: "));
		int faltas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade faltas: "));
				
		if (faltas == 0)
		{
			salariobruto = (salariobruto * 0.02) + salariobruto;
		}
		
		System.out.println("Salario bruto: "+salariobruto);
		
		double aliquotainss = 0;
		
		if (salariobruto <= 1100.00)
		{
			aliquotainss = 0.075;
		}
		else if (salariobruto > 1100.00 && salariobruto <= 2203.48)
		{
			aliquotainss = 0.09;
		}
		else if (salariobruto >  2203.48 && salariobruto <= 3305.22)
		{
			aliquotainss = 0.12;
		}else if (salariobruto >  3305.22 && salariobruto <= 6433.57)
		{
			aliquotainss = 0.14;
		}
		
		double descontoinss = salariobruto*aliquotainss;
		double descontofgts = salariobruto*0.08;
		
		double salarioliquido = salariobruto - descontoinss - descontofgts;
		System.out.printf("Descontos: \nINSS (aliquota: %.2f): R$%.2f \nFGTS: R$%.2f)\n",aliquotainss,descontoinss,descontofgts);
		System.out.println("Salario liquido: R$"+salarioliquido);
	}
}
