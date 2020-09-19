package br.com.oo.xti.heranca;

public class Ave extends Animal {

	
	
	Ave(){
		super(0,null);
	}
	
	
	void comer() {
		super.comer();
	}
	
	void botar()
	{
		System.out.println("Botou Ovo");
	}
	void voar() 
	{
		System.out.println("Voando");
	}
	
	
}
