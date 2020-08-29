package br.com.classes.jantar;

public class Pessoa {

	
	private String nome;
	private double peso;
	
	public Pessoa()
	{}
	public Pessoa(String nome, double peso)
	{
		this.setNome(nome);
		this.setPeso(peso);
		
	}
	
	
	
	public void comer(Comida comida)
	{ double engorda=0.0;
		engorda=comida.getPeso()+getPeso();
		setPeso(engorda);
		
	}
	
	
	
	
	
	
	//methods getters and setters
	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public double getPeso() {
		return peso;
	}





	public void setPeso(double peso) {
		this.peso = peso;
	}





	
	
	
	
	
	
}
