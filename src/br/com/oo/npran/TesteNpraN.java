package br.com.oo.npran;

public class TesteNpraN {

	public static void main(String[] args) {
		
		Aluno a=new Aluno("Djavan");
		Cursos c=new Cursos();
		Assiste assiste=new Assiste();
		assiste.aluno=a;
		c.turma.add(assiste);
		
		
	}
}
