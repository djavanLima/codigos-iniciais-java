package br.com.classes;

public class Produtos {
	String nome;
	double preco;
	public static double desconto;
	
	Produtos(){}
	
	Produtos(String nome, double preco){
		
		Produtos.desconto=25;
		this.nome=nome;
		this.preco=preco;
	}
	
	
	public static void desconto(int op)
	{
		if(op==1) {
			Produtos.desconto=30;
			
		}
		if(op==2) {
			Produtos.desconto=15;
			
		}
				
		
	}
	
	public double mostrarValorAtual() 
	{
		calcularPorcentagem();
		return preco;
	}
	
	public void calcularPorcentagem() 
	{ 
		double porcentagem;
		porcentagem=(preco/100)*Produtos.desconto;
		valorAtual(porcentagem);
	}
	
	public void valorAtual(double porcentagem)
	{
		preco=preco-porcentagem;
		
	}
	
	
	
}
