package br.com.oo.revisao.exercicio.nn;

import java.util.ArrayList;

public class Compra {

	ArrayList<ItemDeProduto> itens = new ArrayList<>();
	
	
	String nome;
	
	Compra(String nome)
	{
		this.nome=nome;
	}
	
	
	
	void adicionarItem(ItemDeProduto item) {
			itens.add(item);
		
	}
	
	void removerItem(ItemDeProduto item) {
		itens.remove(itens.indexOf(item));
	}
	
	
	
	
	
	double valorTotal()
	{
		double soma=0.0;
		for(ItemDeProduto item:itens) {
			soma+=item.valorQuantidade();
			
			
		}
		
		
		return soma;
	}
	
	
	
	
	
	@Override
	public  String toString()
	{
		return this.nome;
	}
	
	
	
	
}
