package br.com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	
	
	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Function<Integer, String> convert =n->Integer.toBinaryString(n);
		UnaryOperator<String> invert= s-> new StringBuilder(s).reverse().toString();
		Function<String, Integer> convert2 =n->Integer.parseInt(n,2);
		Consumer<String> print=System.out::println;
		Consumer<Integer> print1=System.out::println;
		
		nums.stream().map(convert)
					.map(invert)
					.map(convert2)
					.forEach(print1);
		//outra forma
		
		/*
		 * UnaryOperator<String> inverter
		 * =s->new StringBuilder(s).reverse().toString();
		 * Function<String, Integer> binarioParaInt=
		 * s->Integer.parseInt(s,2);
		 * nums.stream()
		 * .map(Integer::toBinaryString)
		 * .map(invert)
		 * .map(binarioParaInt)
		 * .forEach(System.out::println);
		 * */
		
		
	}
	
}
