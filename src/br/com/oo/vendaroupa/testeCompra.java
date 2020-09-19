package br.com.oo.vendaroupa;

public class testeCompra {

	
	public static void main(String[] args)
	{
	
		Cliente c1 = new Cliente("Djavan","01625465211","993017334");
		Divida divida1=new Divida();
		divida1.atualizaDescricao("uma caneta, um lápis de cor, um capacete");
		divida1.adicionarDivida(250.00);
		divida1.atualizaDescricao("uma caneta, um lápis de cor, um capacete, calcinha");
		divida1.adicionarDivida(10.00);
		c1.setDivida(divida1);
		System.out.println(c1.getNome());
		System.out.println(c1.getDivida().getDescricao());
		System.out.println(c1.getDivida().getValor());
		
		c1.getDivida().av(100.00);
		
		System.out.println(c1.getNome());
		System.out.println(c1.getDivida().getDescricao());
		System.out.println(c1.getDivida().getValor());
	}
	
	
}
