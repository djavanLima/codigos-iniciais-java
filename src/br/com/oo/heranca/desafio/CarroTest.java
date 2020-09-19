package br.com.oo.heranca.desafio;

public class CarroTest {

	public static void main(String[] args) 
	{
		Carro civic =new Civic();
		Carro ferrari =new Ferrari();
		ferrari.acelerar();
		civic.acelerar();
		
		System.out.println(ferrari.getVelocidadeAtual());
		System.out.println(civic.getVelocidadeAtual());
		
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		System.out.println(ferrari.getVelocidadeAtual());
		System.out.println(civic.getVelocidadeAtual());
		
	}
	
}
