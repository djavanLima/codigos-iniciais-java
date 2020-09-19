package br.com.oo.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

		public static void main(String[] args)
		{
			
			Consumer<Produto> imprimir = p -> System.out.println(p.nome+ "!!!");
			Produto p1=new Produto("Carro",50.5);
			Produto p2=new Produto("Moto",10.5);
			Produto p3=new Produto("Bicicleta",32.5);
			Produto p4=new Produto("Carroça",20.5);
			Produto p5=new Produto("Cavalo",10.5);
			
				imprimir.accept(p1);
				
				List<Produto> prod = Arrays.asList(p1,p2,p3,p4,p5);
				
				prod.forEach(p->System.out.println(p));
				
				//utilizando imprimir
				System.out.println("\n");
				prod.forEach(imprimir);
				System.out.println("\n");
				prod.forEach(System.out::println);
		}
	
	
}
