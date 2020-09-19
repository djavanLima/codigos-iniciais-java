package br.com.oo.lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		// recebe uma entrada e retorna um boolean
		Predicate <Integer> isPar=num->num %2 ==0;
		Predicate<Integer> isTresDigtos=num->num>99 && num<1000;
		
		// concatena as funções de modo recursivo, onde primeiro pergunta se é 3 digitos
		//e posteriormente 
		System.out.println(isPar.and(isTresDigtos).test(122));
		System.out.println(isPar.or(isTresDigtos).test(122));
	}
	
	
}
