package br.com.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
		public static void main(String[] args) {
			
			
			List<String> aprovados =Arrays.asList("Gui", "Luca", "Ana");
	
		
			for(String n:aprovados) {
				System.out.println(n);
			}
		
			System.out.println("\nutilizando iterator...");
			
			Iterator<String> iterator = aprovados.iterator();
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
		
			System.out.println("\nutilizando Stream...");
			Stream<String> stream =aprovados.stream();
			stream.forEach(System.out::println);
			
		}
}
