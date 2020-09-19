package br.com.oo.lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		
		
		Calculo soma=new Soma();
		Calculo mult=new Multiplicacao();
	
		
		System.out.println(soma.executar(2, 1));
		System.out.println(mult.executar(2, 3));
		
	}
	
	
	
}
