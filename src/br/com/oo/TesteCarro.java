package br.com.oo;

public class TesteCarro {

	public static void main(String[] args)
	{
			Carro c1=new Carro();
			
			
			c1.acelerar();
			c1.acelerar();
			c1.acelerar();
			System.out.println(c1.estaLigado());
			System.out.println(c1.getMotor().getFatorInjecao());
			System.out.println(c1.getMotor().giros());
	}
	
	
	
}
