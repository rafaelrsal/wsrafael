package repeticao;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		String maiorcargo = "";
		double maiorsalario = 0;
		double somasalarios = 0;
		int qtdefuncionarios = 0;
		double salarioatual = 0;
		String cargoatual = "";
		int adicionar = 4;
		
		
		do {			
			cargoatual = JOptionPane.showInputDialog("Digite o cargo: ");
			salarioatual = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio: "));
			
			if (salarioatual > maiorsalario)
			{
				maiorsalario = salarioatual;
				maiorcargo = cargoatual;
			}
			somasalarios += salarioatual;
			qtdefuncionarios++;
			
			System.out.printf("Cargo %s, sal�rio R$%.2f registrado com sucesso!\n",cargoatual.toUpperCase(),salarioatual);
			adicionar = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais sal�rios?");
		}
		while (adicionar == 0);
		
		System.out.printf("\n------------------------------------\nTotal de todos os sal�rios: R$%.2f\nM�dia de todos os sal�rios: R$%.2f\nCargo com maior sal�rio: %s (valor: R$%.2f)",somasalarios,(somasalarios/qtdefuncionarios),maiorcargo,maiorsalario);
				
	}
}
