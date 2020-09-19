package br.com.oo.revisao.exercicio.nn;

public class CompraTeste {

	
	
	
	public static void main(String[] args) {
		
		Cliente c= new Cliente();
		Compra compra1=new Compra("Compra_1");
		Compra compra2=new Compra("Compra_2");
		Compra compra3=new Compra("Compra_3");
		Compra compra4=new Compra("Compra_4");
		Compra compra5=new Compra("Compra_5");
		c.nome="Djavan";
		
		System.out.println();
		
		System.out.println(c.compras.toString());
		
		
		//produtos
		Produto produto1=new Produto("caneta",2.50);
		Produto produto2=new Produto("lápis",2.50);
		Produto produto3=new Produto("borracha",2.50);
		Produto produto4=new Produto("carrinho",500.00);
		//itens de produto
		ItemDeProduto item1 = new ItemDeProduto(produto1,3);
		ItemDeProduto item2 = new ItemDeProduto(produto1,2);
		ItemDeProduto item3 = new ItemDeProduto(produto1,3);
		ItemDeProduto item4 = new ItemDeProduto(produto4,1);
		
		System.out.println("Valor da "+ item1.produto.nome);
		System.out.println(item1.valorQuantidade());
		System.out.println("Valor da "+ item2.produto.nome);
		System.out.println(item2.valorQuantidade());
		
		
		compra1.adicionarItem(item1);
		compra1.adicionarItem(item2);
		
		compra2.adicionarItem(item1);
		compra2.adicionarItem(item4);
		c.adicionarCompras(compra1);
		c.adicionarCompras(compra2);
		
		System.out.println("Valor total da compra: "+compra1.valorTotal());
		
		System.out.println("O cliente pagou o valor total referente as compras: "+c.obterValorTotal());
		
		
	}
	
	
}
