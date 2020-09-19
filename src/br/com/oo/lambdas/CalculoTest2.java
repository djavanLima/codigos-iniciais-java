package br.com.oo.lambdas;

public class CalculoTest2 {

	public static void main(String[] args) {
		
	
		Calculo soma=(x,y)->x+y;
			System.out.println(soma.executar(2, 4));
		
		Calculo mult=(x,y)->x*y;
		System.out.println(mult.executar(2,4));
		
		System.out.println(soma.legal()+ " "+
		Calculo.muitoLegal());
	}
	
	
}
