package variaveis;

import javax.swing.JOptionPane;

public class CalculoProduto {

	public static void main(String[] args) {
		
		String nomeproduto = JOptionPane.showInputDialog("Produto: ");
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor Unitário: "));
		float total = qtde*valor;
		float imposto = total * (float)0.17; //CAST => casting (ajustando a variavel para o tipo especificado;
				
		System.out.println(nomeproduto);
		System.out.println("Valor Total: " + total);
		System.out.println("Imposto (17%): " + imposto);
		
		
		
	}
}
