package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {
	
	public static void main(String[] args) {
		
		int jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1: "));
				
		int jogador2 = -1;
		int contador = 0;
		
		do
		{
			jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2: "));
			contador ++;
			if (jogador2 > jogador1)
			{
				//System.out.println("QUASE! Dica: o n?mero que voc? digitou ? MAIOR. Continue tentando!");
				JOptionPane.showMessageDialog(null, "QUASE! Dica: o n?mero que voc? digitou ? MAIOR. Continue tentando!");
			}
			else if (jogador1 != jogador2)
			{
				JOptionPane.showMessageDialog(null, "QUASE! Dica: o n?mero que voc? digitou ? MENOR. Continue tentando!");
				//System.out.println("QUASE! Dica: o n?mero que voc? digitou ? MENOR. Continue tentando!");
			}
			
		}
		while (jogador2 != jogador1);
		
		if (jogador1 == jogador2)
		{
			JOptionPane.showMessageDialog(null, "Parab?ns, voc? acertou com "+contador+" tentativas!");
			//System.out.printf("Parab?ns, voc? acertou com %d tentativas!", contador);			
		}
		
		//finalizado as 26/05/2021 12:09
		
	}
}
