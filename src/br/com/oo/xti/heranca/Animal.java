package br.com.oo.xti.heranca;

public class Animal {
	
	private int serial;
	String foto;
	double peso;
	String comida;
	
	
	Animal(double peso, String comida)
	{
		this.peso=peso;
		this.comida=comida;
	}
	
	
	
	
	void comer()
	{
		System.out.println("comeu");
	}
	void dormir()
	{
		System.out.println("fazer barulho");
	}
	void movimentar()
	{
		System.out.println("movimentou");
	}
	void fazerBarulho()
	{
		System.out.println("Fazer Barulho");
	}
	
	
}
