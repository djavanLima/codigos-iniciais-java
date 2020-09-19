package br.com.oo.revisao;

import java.util.ArrayList;

public class Compra {

	
	String cliente;
	ArrayList<Item> itens =new ArrayList<>();
	
	
	
	double getValorTotal()
	{
		
		double resultado=0;
		for(Item item:itens) {
			System.out.println(item);
			resultado+=(item.getPreco()*item.getQuantidade());
		}
		
		
		return resultado;
	}
}
