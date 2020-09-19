package br.com.oo.lambdas;

@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);
	
	
	default String legal()
	{
		return "Legal";
	}
	
	public static String  muitoLegal() {
		return "Muito legal";
	}
}
