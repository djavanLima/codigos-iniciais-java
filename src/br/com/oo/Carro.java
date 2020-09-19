package br.com.oo;

public class Carro {
	private String modelo;
	private Motor motor=new Motor();
	
	
	
	public Carro()
	{
		
	}
	public Carro(String modelo,Motor motor) {
		setModelo(modelo);
		setMotor(motor);
	}
	
	
	
	void acelerar()
	{
		double sum=motor.getFatorInjecao();
		if(sum<2.6) {
		sum+=0.4;
		getMotor().setFatorInjecao(sum);
		}
	}
		
	
	void frear()
	{
		double menus=motor.getFatorInjecao();
		if(menus>0.5) {
		menus-=0.4;
		getMotor().setFatorInjecao(menus);
		}
	}
	
	void ligar() 
	{
		getMotor().setLigado(true);;
	}
	
	void desligar()
	{
		getMotor().setLigado(false);
	}
	
	boolean estaLigado() {
		return  getMotor().getLigado();
	}
	
	
	
	
	
	
	
	
	
	
	
	public String getModelo()
	{
		return this.modelo;
	}
	public void setModelo(String modelo) 
	{
		this.modelo=modelo;
	}
	public Motor getMotor()
	{
		return this.motor;
	}
	public void setMotor(Motor motor)
	{
		this.motor=motor;
	}
	
	
}
