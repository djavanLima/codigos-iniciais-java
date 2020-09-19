package br.com.oo.revisao;

public class Motor {
	double fatorInjecao;
	boolean ligado;
	Carro carro;
	
	
	Motor( Carro carro)
	{
		setFatorInjecao(1);
		setLigado(false);
		this.carro=carro;
		
	}
	
	int giros()
	{
		if(!ligado) {
			return 0;
		}else
		{
			return (int) Math.round(getFatorInjecao()*3000);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public double getFatorInjecao() {
		return fatorInjecao;
	}

	public void setFatorInjecao(double fatorInjecao) {
		this.fatorInjecao = fatorInjecao;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
}
