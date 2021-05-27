package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		for (int i=0; i< 500; i++)
		{
			System.out.println(i);
		}
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Tabuada: "));
		for (int contador=0; contador < 11; contador+=1)
		{
			System.out.printf("%d X %d = %d\n",tabuada,contador,(tabuada*contador));
		}
	}
	
}
