package br.com.oo.heranca;

public class Jogo {

	public static void main(String[] args) {
	
		Monstro monstro = new Monstro();
		monstro.x=10;
		monstro.y=10;
		Heroi h =new Heroi();
		h.x=10;
		h.y=11;
		
		System.out.println(monstro.vida);
		System.out.println(h.vida);
		System.out.println("O foram realizados multiplos ataques em apenas 1 segundo");
		
		monstro.atacar(h);
		h.atacar(monstro);
		
		h.atacar(monstro);
		
		h.atacar(monstro);
		
		h.atacar(monstro);
	
	
	System.out.println("Hercule realizou: " +h.contaAtaque+ " ataques em 1 segundo");
	
	System.out.println("Essa é a vida de monstro: "+monstro.vida);
	System.out.println("Essa é a vida de Hércules: "+h.vida);
	
	}

}
