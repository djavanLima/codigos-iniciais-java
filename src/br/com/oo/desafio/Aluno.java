package br.com.oo.desafio;

public class Aluno {

	
	private	String nome;
	private String matricula;
	private double[] nota=new double[4];
	private double nota1;

 	

	public Aluno(String nome, Double nota)
	{
		setNome(nome);
		setNota1(nota);
	}
	
	public Aluno()
	{
		
	}
	
	
	
	public double getNota1() {
		return nota1;
	}



	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}


	
	double calcularMedia() 
	{	double[] nota=getNota();
		
		int alunos=0;
		double totalNotas=0;
		for(double n:nota)
		{
			totalNotas+=n;
			alunos+=1;
		}
		double media=totalNotas/alunos;
		return media;
		
	}
	
	
	
	String aprovado(double media) {
		if(media>=7) 
		{
			return "aprovado";	
		}
		else
		{
			return "Reprovado";
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double[] getNota() {
		return nota;
	}
	public void setNota(double[] nota) {
		this.nota = nota;
	}
	
	
	
	
	
	
}
