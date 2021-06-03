package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Curso;
import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.modelo.Turma;
import util.Magica;

public class TesteTurma {
	
	
	public static void main(String[] args) {
		
		Turma turma = new Turma(
				Magica.s("Sigla: "),
				Magica.s("Período: "),
				Magica.s("Sala: "),
				new Professor(
						Magica.s("Nome Horario: "),
						Magica.s("Formação: "),
						Magica.i("Carga Horária: "),
						Magica.d("Valor hora: "),
						new Endereco(
								Magica.s("Logradouro: "),
								Magica.s("Complemento: "),
								Magica.s("Número: "),
								Magica.s("Bairro: "),
								Magica.s("Cidade: "),
								Magica.s("UF: "),
								Magica.s("CEP: ") 
								)
						),
				new Curso(
						Magica.s("Nome curso: "),
						Magica.s("Titulação: "),
						Magica.d("Valor curso: "),
						Magica.i("Carga horaria: ")
						),
				new Aluno(
						Magica.i("RM: "),
						new Endereco(
								Magica.s("Logradouro: "),
								Magica.s("Complemento: "),
								Magica.s("Número: "),
								Magica.s("Bairro: "),
								Magica.s("Cidade: "),
								Magica.s("UF: "),
								Magica.s("CEP: ") 
								)
						)
				);
	}
}
