package br.com.oo.lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Produto {

	String nome;
	double valor;
	double desconto;
	Produto()
	{
		
	}
	
	Produto(String nome, Double valor, double desconto){
		
		this.nome= nome;
		this.valor=valor;
		this.desconto=desconto;
		
	}
	
	

	
	
	
	public String toString()
	{
		return getNome()+ " " +getValor();
	}
	
	
	
	
	
	Produto(String nome, double valor)
	{
		setNome(nome);
		setValor(valor);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
}
