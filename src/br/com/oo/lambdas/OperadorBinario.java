package br.com.oo.lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	
	
	public static void main(String[] args) {
		
		//recebe dois parametros de entrada e oferece uma saida do mesmo tipo
		//forma 1
		BinaryOperator<Double> media=(x,y)->{
			return (x+y)/2;
		};
		//forma 2
		
		BinaryOperator<Double> media1=(x,y)->(x+y)/2;
		
		//Bifunction< primeira entrada/ segunda entrada/o terceiro é o resultado>
		BiFunction<Double, Double, String> mediaAlunos=(x,y)-> 
		((x+y)/2) >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(mediaAlunos.apply(8.0, 6.0));
	
		
		//Function<Entrada e a Saida>
		Function<Double, String> conceito= m-> m>= 7.0 ? "aprovado" : "reprovado";
		
		
		
		
		
		
	}
}
