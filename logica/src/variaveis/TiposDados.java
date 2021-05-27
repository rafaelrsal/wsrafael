package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	//Comentário é com //
	
	/*
	 * bloco de comentarios 
	 */	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso"));
		double imc = peso / (altura * altura);
		
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " ano(s)");
		System.out.println("Altura: " + altura + "m");
		System.out.println("Peso: " + peso + "kg");
		System.out.println("IMC: " + imc);
		
	}
	
}
