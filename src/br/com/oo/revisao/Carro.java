package br.com.oo.revisao;

public class Carro {

	final Motor motor;
	
	
	Carro()
	{
		motor=new Motor(this);
	}
	
	void acelerar() {
	
		if(isLigado()==true) {
		double acelerar=motor.getFatorInjecao()+0.4;
		motor.setFatorInjecao(acelerar);
		}
		else {
			System.out.println("ligue o carro");
		}
			
	}
	
	void frear()
	{
		if(motor.getFatorInjecao()>1) {
		double frear=motor.getFatorInjecao()-0.4;
		motor.setFatorInjecao(frear);
		}
		else
		{
			motor.setFatorInjecao(1);
		}
	}
	
	
	void ligado()
	{
		motor.setLigado(true);
	}
	
	void desligar()
	{
		motor.ligado=false;
	}
	
	boolean isLigado()// verifica se o motor esta ligado
	{
		return motor.isLigado();
	}
	
	
}
