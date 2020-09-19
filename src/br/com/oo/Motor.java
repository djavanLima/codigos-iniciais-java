package br.com.oo;

import java.math.MathContext;

public class Motor {
	boolean ligado;
	double fatorInjecao;
	
	public Motor()
	{
		this.ligado=false;
		this.fatorInjecao=1;
		
	}
	
	public Motor(boolean ligado)
	{
		setLigado(ligado);
	}
	
	int giros(){
		return (int) Math.round(fatorInjecao*3000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public double getFatorInjecao()
	{
		return this.fatorInjecao;
	}
	
	public void setFatorInjecao(double fatorInjecao) 
	{
		this.fatorInjecao=fatorInjecao;
	}
	
	public void setLigado(boolean ligado)
	{
		this.ligado=ligado;
	}
	
	public boolean getLigado()
	{
		return this.ligado;
	}
	
	
	
	
}
