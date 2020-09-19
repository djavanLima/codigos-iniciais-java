package br.com.oo.xti.interface1;

public class Cubo implements VolumeCalculavel, AreaCalculavel {

	public double calculaVolume(double x, double y, double z) {
		
		return x*y*z;
		
	};
	
	@Override
	public double calcularArea(double x, double y) {
		// TODO Auto-generated method stub
		return x*y;
	}
	
	
}
