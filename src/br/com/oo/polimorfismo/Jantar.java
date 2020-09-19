package br.com.oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		
	
	Comida arroz=new Arroz();
	arroz.setPeso(2);
	Comida sorvete=new Sorvete();
	sorvete.setPeso(3);
	Comida feijao=new Feijao();
	feijao.setPeso(2.5);
	Pessoa Djavan = new Pessoa();
	Djavan.setPeso(90.00);
	
	Djavan.comer(feijao);
	System.out.println("Peso após comer feijão: "+Djavan.getPeso());
	
	Djavan.comer(arroz);
	System.out.println("Peso após comer arroz: "+Djavan.getPeso());
	
	Djavan.comer(sorvete);
	System.out.println(" Peso após comer sorvete: "+Djavan.getPeso());
	
	}
	
	
	
}
