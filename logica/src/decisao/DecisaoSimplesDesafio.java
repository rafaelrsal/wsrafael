package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {

	public static void main(String[] args) 	{
		
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade: "));
		
		if (idade < 16)
		{
			System.out.println(nome+", voc� n�o pode votar...");
		}		
		if (idade >= 18 && idade < 70)
		{
			System.out.println(nome+ ", seu voto � obrigat�rio!");
		}		
		if ((idade >= 16 && idade <=17) || idade >= 70)
		{
			System.out.println(nome+", seu voto � facultativo");
		}
		
	}
}
