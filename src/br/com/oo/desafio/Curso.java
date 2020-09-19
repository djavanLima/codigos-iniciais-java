package br.com.oo.desafio;

public class Curso {
	private String nome;
	private String horario;
	private Aluno[] alunos;
	private Professor professor=new Professor();
	Curso()
	{
		alunos=new Aluno[5];
	}
	
	Curso(String nome, String horario)
	{	
		this();//assim chamo o construtor anterior
		setNome(nome);
		setHorario(horario);
		
	}
	
	
	
	public double mediaTurma()
	{	Aluno[] alunos = new Aluno[5];
	 	alunos=getAlunos();
		double mediaTurma=(alunos[0].calcularMedia()+
		alunos[1].calcularMedia()+
		alunos[2].calcularMedia()+
		alunos[3].calcularMedia()+
		alunos[4].calcularMedia())/alunos.length;
		return mediaTurma;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
	
	
}
