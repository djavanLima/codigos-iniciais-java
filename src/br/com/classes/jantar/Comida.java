package br.com.classes.jantar;

public class Comida {

	private String nome;
	 private double peso;
	 
	public Comida() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Comida(String nome, double peso) {
		this.setNome(nome);
		this.setPeso(peso);
		
		
	}
	
	//methods getters and setters
	public void setNome(String nome) 
	{
		this.nome=nome;
	}
	public void setPeso(double peso)
	{
	 this.peso=peso;	
	}
	public String getNome()
	{
		return this.nome;
	}
	public double getPeso() 
	{
		return this.peso;
	}
	
	
	
	
	
}
