package br.com.oo.desafio;

public class Calculo {

	
	 private double[] nota=new double[4];
	
	 Calculo()
	 {
		 this.nota[1]=1.0;
	 }
	 
	 
	 public void setNota(double...nota) {
		 this.nota=nota;
		 
	 }
	 
	 public double[] getNota()
	 {
		 return this.nota;
	 }
	 
	 public String mostrarNotas()
	 {
		 return "nota 1"+ getNota()[0];
	 }
	 
	 
	 
}
