package br.com.arrays;

import java.util.Locale;
import java.util.Scanner;

//notas alunos
public class Exercicio2 {

	
	
	public static void main(String[] args)
	{
		double avg;
		double valorTotal=0;
		Scanner read=new Scanner(System.in);
		read.useLocale(Locale.ENGLISH);
		System.out.println("Insira o numero de notas que deseja informar");
		Integer qtdNotas=read.nextInt();
		
		
		double[] notas=new double[qtdNotas];
		int i=0;
		do 
		{
		System.out.println("informe nota" + (i+1));
			notas[i]=read.nextDouble();
			if(notas[i]<0) {
				--i;
				System.out.println("Digite novamente, volores negativos e maiores que 10 são invalidos");
			}
			i++;
		}while(i<qtdNotas);
		
		for(double nota:notas)
		{
			valorTotal+=nota;
		}
		
		avg=valorTotal/qtdNotas;
		
		System.out.println("A media entre as "+qtdNotas + " notas é " + avg);
		
	}

}



