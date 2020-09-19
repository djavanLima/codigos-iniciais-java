package br.com.oo.desafio;

public class testeNota {

	public static void main(String[] args) {
		Calculo c=new Calculo();
		double notaTotal=0;
		int alunos=0;
		for(double n: c.getNota()){
			System.out.println(n);
			notaTotal+=n;
			alunos+=1;
		}
		
		double media=notaTotal/alunos;
		System.out.println("A sua media é: "+media);
	}

}
