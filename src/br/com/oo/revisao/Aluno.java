package br.com.oo.revisao;

import java.util.ArrayList;

public class Aluno {

	private String nome;
	private ArrayList<Curso> cursos =new ArrayList<>();

	Aluno(String nome)
	{
		setNome(nome);
	}
	
	
	public void adicionarCurso(Curso curso)// em cima é um arraylist entretanto
	{											//é adicionado de ujm por um
	
		getCursos().add(curso);
		curso.getAlunos().add(this);
		

		
		
	}
	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}


	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}

	
	
	
}
