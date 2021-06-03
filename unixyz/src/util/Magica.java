package util;

import javax.swing.JOptionPane;

public class Magica {

	public static String s (String msg)
	{
		return JOptionPane.showInputDialog(msg);
	}
	
	public static int i (String msg)
	{
		//METODO ESTATICO PARA FACILITAR O JOPTIONPANE DE INT
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	public static double d (String msg)
	{
		return Double.parseDouble(s(msg));
	}
	
	public static boolean b(String msg)
	{
		if(JOptionPane.showConfirmDialog(null, msg, "Pergunta", JOptionPane.YES_NO_OPTION)==0)
		{				
			return true;
		}
		return false;
	}
}
