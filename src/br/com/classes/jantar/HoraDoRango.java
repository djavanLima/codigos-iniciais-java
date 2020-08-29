package br.com.classes.jantar;

import java.util.Locale;
import java.util.Scanner;

public class HoraDoRango {

	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		read.useLocale(Locale.ENGLISH);
		Scanner readString= new Scanner(System.in);
		System.out.println("Hora do Rango");
		System.out.println("Escolha o melhor Rango de sua cidade");
		System.out.println("Informe  o nome do prato");
		String nome=readString.nextLine();
		System.out.println("Qual o peso do prato");
		double peso=read.nextDouble();
		
		Comida comida=new Comida(nome,peso);
		Pessoa pessoa=new Pessoa("Djavan",80.0);
		System.out.println("Seu peso antes de comer era "+ pessoa.getPeso());
		pessoa.comer(comida);
		
		System.out.println("Agora  " + pessoa.getNome()+" engordou para"+ pessoa.getPeso());
	}
	
}
