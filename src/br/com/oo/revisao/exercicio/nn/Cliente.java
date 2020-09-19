package br.com.oo.revisao.exercicio.nn;

import java.util.ArrayList;

public class Cliente {

	String nome;
	ArrayList<Compra> compras= new ArrayList<>(); 
	
	
	//Funcao para adicionar compra
	void adicionarCompras(Compra compra)
	{
		compras.add(compra);
	}
	void removeCompra(Compra compra)
	{
		//Funcao para remover compra
		compras.remove(compras.indexOf(compra));
		
	}
	
	
	
	double obterValorTotal(){
		double resultado=0.0;
		for(Compra compra:compras )
		{
			
			resultado+=compra.valorTotal();
			
		}
		
		return resultado;
	}
	
	
	
}
