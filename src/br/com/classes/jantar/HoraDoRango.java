package br.com.classes.jantar;

import java.util.Scanner;

public class HoraDoRango {

	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		Scanner readString= new Scanner(System.in);
		System.out.println("Hora do Rango");
		System.out.println("Escolha o melhor Rango de sua cidade");
		System.out.println("Informe  o nome do prato");
		String nome=readString.nextLine();
		System.out.println("Qual o peso do prato");
		double peso=read.nextDouble();
		
	}
	
}
