package br.com.oo.desafio;

import java.util.Arrays;
import java.util.Scanner;

public class CursoTeste {

	public double[] pedirNotas(double[] notas, Scanner read) {
		System.out.println("Digite as notas do aluno");
		for(int i=0;i<notas.length;i++)
		{
			System.out.println("Digite nota "+(i+1)+" do aluno");
			
			notas[i]=read.nextDouble();
		}
		return notas;
	}
	
	
	
	public static void main(String[] args)
	{
		CursoTeste ex=new CursoTeste();
		Scanner read=new Scanner(System.in);
		Curso c= new Curso();
		Aluno[] alunos=new Aluno[5];
		// tenho que inicializar as posiçoes de objetos
		for(int i=0;i<alunos.length;i++) {
		alunos[i]= new Aluno();
		}
		
		
		Professor professor=new Professor();
		double[] notas= new double[4];
		
		System.out.println("Digite as notas do aluno 1");
		
		
		alunos[0].setNota(ex.pedirNotas(notas,read));
		System.out.println("\n");
		System.out.println("sua media é: "+alunos[0].calcularMedia());
		
	System.out.println("Digite as notas do aluno 2");
		alunos[1].setNota(ex.pedirNotas(notas,read));
		System.out.println("\n");
		System.out.println("Digite as notas do aluno 3");
		alunos[2].setNota(ex.pedirNotas(notas,read));
		System.out.println("\n");
		System.out.println("Digite as notas do aluno 4");
		alunos[3].setNota(ex.pedirNotas(notas,read));
		System.out.println("\n");
		System.out.println("Digite as notas do aluno 5");
		alunos[4].setNota(ex.pedirNotas(notas,read));
		
		c.setAlunos(alunos);
		System.out.println("a media da turma é: "+c.mediaTurma());
		
		
		
	}
	
	
	
	
}
