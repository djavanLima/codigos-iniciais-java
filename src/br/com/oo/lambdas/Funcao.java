package br.com.oo.lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		Function<Integer, String> parOuImpar=
				numero -> 
				numero % 2==0 ? "par" : "impar";
		
				
				System.out.println(parOuImpar.apply(44));
				
		Function<String, String> oResultado= valor->"O resultado é: " + valor;
		
		
		Function<String, String> empolgado=
				valor->valor+"!!!";
		
		Function<String,String> duvida=valor->valor+ "????";
		
		String resultadoFinal=parOuImpar.andThen(oResultado)
				.andThen(duvida)
				.apply(44);
		
			System.out.println(resultadoFinal);
	}
	
	
}
