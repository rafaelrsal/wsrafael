package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		int dia = 0, mes = 0, ano = 0;
		
		while (ano < 1920 || ano > 2003)
		{
			ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
		}
		
		while (mes < 1 || mes > 12)
		{
			mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o m�s: "));		
		}
		
		if (mes == 2)
		{
			while (dia < 1 || dia > 29)
			{
				dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
			}
		}else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes ==12)
		{
			while (dia < 1 || dia > 31)
			{
				dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
			}
		}
		else
		{
			while (dia < 1 || dia > 30)
			{
				dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
			}
		}
		
		
		System.out.printf("Data completa: %d /%d /%d", dia, mes, ano);				
		
	}
	

}
