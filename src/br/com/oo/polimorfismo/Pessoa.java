package br.com.oo.polimorfismo;

public class Pessoa {

	
	
	
	
	
	
	protected double peso;
	

	public Pessoa()
	{
		setPeso(peso);
	}
	
	
	
	public void comer(Comida comida) 
	{
		this.peso+=comida.getPeso();
	}
	
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	
	
}
