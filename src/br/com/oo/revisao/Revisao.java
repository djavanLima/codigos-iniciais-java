package br.com.oo.revisao;

public class Revisao {

	public static void main(String[] args) {
		
		Carro c = new Carro();
		System.out.println(c.isLigado());
		
		//c.ligado();
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		
		System.out.println(c.motor.getFatorInjecao());
	}
	
	
}
