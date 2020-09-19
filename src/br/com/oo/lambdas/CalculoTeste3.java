package br.com.oo.lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		BinaryOperator<Double> calc=(x,y)->{return x + y;};
		
		System.out.println(calc.apply(35.0, 40.0));
		
		 calc=(x,y)->x*y;
		 
		 System.out.println(calc.apply(2.0, 50.0));
		
	}
	
	
}
