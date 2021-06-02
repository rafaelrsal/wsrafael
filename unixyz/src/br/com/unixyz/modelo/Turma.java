package br.com.unixyz.modelo;

public class Turma {

	private String sigla;
	private String periodo;
	private String sala;
	private Professor professor;
	private Curso curso;
	private Aluno aluno;
	
	
	
	public Turma() {
		super();
	}



	public Turma(String sigla, String periodo, String sala, Professor professor, Curso curso, Aluno aluno) {
		super();
		this.sigla = sigla;
		this.periodo = periodo;
		this.sala = sala;
		this.professor = professor;
		this.curso = curso;
		this.aluno = aluno;
	}



	public String getSigla() {
		return sigla;
	}



	public void setSigla(String sigla) {
		this.sigla = sigla;
	}



	public String getPeriodo() {
		return periodo;
	}



	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}



	public String getSala() {
		return sala;
	}



	public void setSala(String sala) {
		this.sala = sala;
	}



	public Professor getProfessor() {
		return professor;
	}



	public void setProfessor(Professor professor) {
		this.professor = professor;
	}



	public Curso getCurso() {
		return curso;
	}



	public void setCurso(Curso curso) {
		this.curso = curso;
	}



	public Aluno getAluno() {
		return aluno;
	}



	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}



	@Override
	public String toString() {
		return "Turma [sigla=" + sigla + ", periodo=" + periodo + ", sala=" + sala + ", professor=" + professor
				+ ", curso=" + curso + ", aluno=" + aluno + "]";
	}
	
	
	
}
