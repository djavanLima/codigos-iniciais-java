package br.com.oo.lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		
		
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois=n -> n * 2;
		UnaryOperator<Integer> quadrado=n->n*n;
		int resultado=maisDois
				.andThen(vezesDois)
				.andThen(quadrado)
				.apply(1);
		System.out.println(resultado);
		
		int resultado2=quadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(1);
		System.out.println(resultado2);
		
		
	}
	
}
