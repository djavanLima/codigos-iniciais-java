package br.com.oo;

public class CompraTeste {

	
	public static void main(String[] args)
	{
		Compra c1=new Compra();
		c1.cliente="Jo�o Pedro";
		c1.itens.add(new Item("Caneta",20,7.4));
		c1.itens.add(new Item("Borracha",12,3.89));
		
		
		System.out.println(c1.obterValorTotal());
	}

}
