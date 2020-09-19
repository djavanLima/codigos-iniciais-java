package br.com.oo.lambdas;

import java.util.List;
import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {
		
		List<String> aprovados=Arrays
				.asList("Ana","Bia","Gui","Lia");
		System.out.println("Forma Tradicional.....");
		
		for(String nome:aprovados)
		{
			System.out.println(nome);
		}
		
		System.out.println(" \n Lambda #01...");
		aprovados.forEach(
				nome->{
					System.out.println(nome + "!!!");
		
		
		});
		
		
		System.out.println(" \n Lambda simplificado #02...");
		aprovados.forEach(nome->System.out.println(nome + "!!!"));
		
		System.out.println("\n Method Reference...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nlambda 2");
		aprovados.forEach(nome->meuImprimir(nome));
		
		System.out.println("\nMethod Reference 2");
		aprovados.forEach(ForEach::meuImprimir);
		
	
	}
	static void meuImprimir(String nome)
	{
		System.out.println("oi eu me chamo "+ nome);
	}
	
	
}
