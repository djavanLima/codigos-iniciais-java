package br.com.oo.treino;

public class Calculadora {

		double x;
		double y;
	
		
		double calcular(String variavel){
			if(variavel=="*") {
				return multiplicacao();
			}
			else if(variavel=="+") {
				return soma();
			}
			else if(variavel=="-") {
				return subtracao();
			}
			
			else if(variavel=="/") {
				return divisao();
			}
			
			else {
				return 0.0;
			}
			
			
		}
		
		double soma() 
		{
			
			return getX()+getY();
		}
		double subtracao() 
		{
			return getX()-getY();
		}
		double multiplicacao()
		{
			return getX()*getY();
		}
		double divisao()
		{
			return getX()/getY();
		}
	
	
		
	double	getX(){
		return this.x;
	}
	
	void setX(double value) {
		this.x=value;
	}
	
	double getY()
	{
		return this.y;
	}
	void setY(double value) 
	{
		this.y=value;
				
	}
		
}
