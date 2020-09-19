package br.com.oo.xti.interface1;

public class Quadrado implements AreaCalculavel {
	
	
	@Override
	public double calcularArea(double x, double y) {
		
		return x*x;
	}
}
