package br.com.oo.revisao;

import java.util.ArrayList;

public class Curso {

	
	private  String nome;
	private  ArrayList<Aluno> alunos=new ArrayList<>();
	
	
	Curso(String nome)
	{
		setNome(nome);
	}
	
	
	void adicionarAluno(Aluno aluno)
	{
		getAlunos().add(aluno);
		aluno.getCursos().add(this);;
		
	}
	
	@Override
	
	public String toString()
	{
		return "curso " +getNome();
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
}
