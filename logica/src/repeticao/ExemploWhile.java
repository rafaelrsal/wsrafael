package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		
		String email = JOptionPane.showInputDialog("Digite o email: ").toLowerCase();
		
		while (email.contains("@") == false || email.indexOf("@") < 2)
		{			
			email = JOptionPane.showInputDialog("Digite o email novamente: ").toLowerCase();
		}
		
		System.out.println("Usuário: " + email.substring(0, email.indexOf("@")));
		
		String nome = JOptionPane.showInputDialog("Digite o nome: ").toUpperCase();
		
		while (nome.length() <= 3 && nome.length() >20)
		{
			nome = JOptionPane.showInputDialog("Digite o nome novamente: ").toUpperCase();
		}
		
		System.out.println(nome);
	}
}
