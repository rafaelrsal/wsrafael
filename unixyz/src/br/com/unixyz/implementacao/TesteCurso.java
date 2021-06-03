package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Curso;
import br.com.unixyz.modelo.Graduacao;
import br.com.unixyz.modelo.Pos;
import util.Magica;

public class TesteCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(JOptionPane.showConfirmDialog(null, "Teste"));

		int opcao = Magica.i("Digite 1 para Gradua��o ou 2 para P�s: ");
		while (opcao !=1 && opcao !=2)
		{
				opcao = Magica.i("Digite 1 para Gradua��o ou 2 para P�s: ");
		}
		
		Curso curso = new Curso();
		
		if (opcao ==1)
		{
			curso = new Graduacao(
					Magica.s("Nome: "),
					Magica.s("Titula��o:"),
					Magica.d("Valor:"),
					Magica.i("Carga Hor�ria"),
					Magica.s("Projeto Conclusao"),
					Magica.i("Carga horaria estagio"));
		}
		else
		{
			curso = new Pos(
					Magica.s("Nome:"),
					Magica.s("Titula��o:"),
					Magica.d("Valor:"),
					Magica.i("Carga Hor�ria:"),
					Magica.b("Tem Intercambio?"),
					Magica.s("Nivel")
					);
		}
		
		System.out.println(curso.toString());
	}

}
