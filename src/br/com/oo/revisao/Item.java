package br.com.oo.revisao;

public class Item {
	private String nome;
	private int quantidade;
	private double preco;
		
	
	
	Item(String nome,int quantidade, double preco)
	{
		this.nome=nome;
		this.quantidade=quantidade;
		this.preco=preco;
	}
	
	
	
	public String toString()
	{
		return this.nome+ " quantia: " + this.quantidade + " preco: " + this.preco;
	}
	
		
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



}
