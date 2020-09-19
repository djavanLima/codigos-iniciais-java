package br.com.oo.revisao.exercicio.nn;

public class ItemDeProduto {
	Produto produto = new Produto();
	int quantidade;
	ItemDeProduto(Produto produto, int quantidade)
	{
		this.produto=produto;
		this.quantidade=quantidade;
		
	}
	
	 double valorQuantidade()
	{
		return quantidade*this.produto.preco;
	}
	
	
	
	
}
