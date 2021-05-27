package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		
		String disciplina = JOptionPane.showInputDialog("Disciplina: ").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
		float media = (nota1+nota2)/2;
		
		if (media >= 6)
		{
			System.out.println("Parabéns. Você foi aprovado!");
		}
		if (media <4)
		{
			System.out.println("Infelizmente você foi reprovado!s");
		}
		if (media<6 && media>=4)
		{
			System.out.println("Você ainda tem chance no exame...");
		}
		
		System.out.println("Sua media na disciplina "+disciplina+ " foi: " + media);
	}
}
