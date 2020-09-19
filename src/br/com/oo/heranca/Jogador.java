package br.com.oo.heranca;

public class Jogador {

	
	int x;
	int y;
	int vida=100;
	int contaAtaque=0;
	
	Jogador(){
		this(0,0);
	}
	
	
	Jogador(int x, int y)
	{
		this.x=x;
		this.y=y;
		
	}
	
	
	
	
	boolean atacar(Jogador oponente)
	{
		int deltaX=Math.abs(x-oponente.x);
		int deltaY=Math.abs(y-oponente.y);
		
		if (deltaX==0 && deltaY==1) {
			oponente.vida-=10;
			contaAtaque+=1;
			return true;
			
		}
		else if(deltaX==1 && deltaY==0) 
		{
			contaAtaque+=1;
			oponente.vida-=10;
			return true;
		}
		else {
		return false;
		}
	}
	
	
	
	
	
	
	boolean andar(Direcao direcao)
	{
		if(Direcao.NORTE==direcao)
		{
			y++;
			
		}
		
		if(Direcao.SUL==direcao)
		{
			y--;
			
		}
		
		if(Direcao.LEST==direcao) 
		{
			x++;
		}
		
		if (Direcao.OESTE==direcao) {
			
			x--;
		}
		return true;
	}
	
	
	
	
	
}
