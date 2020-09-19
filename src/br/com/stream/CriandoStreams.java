package br.com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer <String> print =System.out::print;
		
		Stream<String> langs =Stream.of("Java","Lua","Js\n");
		
		String[] maisLangs= {"Python", "Lisp","Perl","Go\n"};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs,1,4).forEach(print);
		
		
		List<String> outrasLangs=Arrays.asList("c","PhP","Kotlin\n");
		
		/*gerar stream de forma infinita
		 * Stream.generate(()->"a").forEach(print);
		 * Stream.iterate(0,n->n+1).forEach(print);
		 * */
		
		
		
	}
		
}
