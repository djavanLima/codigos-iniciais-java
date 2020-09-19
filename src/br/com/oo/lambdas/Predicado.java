package br.com.oo.lambdas;

import java.util.function.Predicate;

public class Predicado {

	
	public static void main(String[] args) {
		
		Predicate<Produto> isPrice = a-> a.valor>=30;
			
		//Exemplo com objeto double
		Predicate<Double> isAlto=e->(e.doubleValue()-4.0)>=10;
		Double j=13.0;
		
		
		Produto produto=new Produto("Cama",750);
		
		System.out.println(isPrice.test(produto));
		System.out.println("Esse aqui é um objeto double e é maior.  true or false? "+isAlto.test(j));
	}
}
