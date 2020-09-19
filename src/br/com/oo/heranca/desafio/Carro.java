package br.com.oo.heranca.desafio;

public class Carro {
	
	private String Modelo;
	private double velocidadeAtual;
	
	

	public void acelerar()
	{
		double incrementaVel=getVelocidadeAtual()+5;
		setVelocidadeAtual(incrementaVel);	
	}

	public void frear() {
		double decrementaVel=getVelocidadeAtual()-5;
		if(decrementaVel>=0) {
		setVelocidadeAtual(decrementaVel);
	
		}
		else {
			System.out.println("carro esta parado");
		}
		
		}

	
	
	
	
	
	
	
	
	
	
	
	
	public String getModelo() {
		return Modelo;
	}



	public void setModelo(String modelo) {
		Modelo = modelo;
	}



	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}



	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	
	
	
	
	
	
	
	
	
}
