package repeticao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		String email = JOptionPane.showInputDialog("Digite seu email: ");
		int adicionar = JOptionPane.showConfirmDialog(null, "Deseja adicionar itens para a sua compra?");
		String nomeproduto = "";
		double valor = 0;
		int qtde = 0;
		double valortotal = 0;
		
		//System.out.println(adicionar);
		
		while (adicionar == 0) 
		{
			nomeproduto = JOptionPane.showInputDialog("Nome do produto: ");
			valor = Double.parseDouble(JOptionPane.showInputDialog("Valor de "+nomeproduto+": "));
			qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
			
			System.out.printf("Valor total para %s: %.2f\n",nomeproduto,(qtde * valor));
			valortotal += (qtde * valor);
			adicionar = JOptionPane.showConfirmDialog(null, "Deseja adicionar itens para a sua compra?");
		}
		
		System.out.printf("\n---------------------\nValor TOTAL da compra de %s: R$%.2f", nome, valortotal);
	}
	
}
