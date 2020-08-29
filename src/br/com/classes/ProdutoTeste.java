package br.com.classes;

import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args)
	{
		int op;
		ArrayList<Produtos> produto =new ArrayList<>();
		
		
		Scanner read= new Scanner(System.in);
		produto.add(0,new Produtos("maca",2.00));
		produto.add(1,new Produtos("banana",5.00));
		System.out.println("Informe a data comemorativa");
		System.out.println("Digite 1 para Carnaval 30% desconto");
		System.out.println("Digite 2 para Natal 15% desconto");
		System.out.println("Ao Digitar qualquer outro valor se assumirá 25% de desconto");
		op=read.nextInt();
		Produtos.desconto(op);
		System.out.println(produto.get(0).mostrarValorAtual());
		System.out.println(produto.get(1).mostrarValorAtual());
		
		
	}
	
}
