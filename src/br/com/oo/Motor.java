package br.com.oo;

import java.math.MathContext;

public class Motor {
	boolean ligado=false;
	double fatorInjecao=1;
	int giros(){
		return (int) Math.round(fatorInjecao*3000);
	}
}
