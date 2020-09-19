package br.com.oo.revisao;

public class CursoTeste {

	
	public static void main(String[] args) {
		
		
		
		Curso c1 =new Curso("Java");
		Curso c2 =new Curso("Sql");
		Curso c3 =new Curso("React");
		
		Aluno a=new Aluno("Djavan");
		Aluno a1=new Aluno("Evandro");
		Aluno a2=new Aluno("Marcel");
		
		a.adicionarCurso(c1);
		a.adicionarCurso(c2);
		
		a1.adicionarCurso(c2);
		a1.adicionarCurso(c3);
		
		
		System.out.println( a1.getNome()+" realiza "+a1.getCursos().toString());
		System.out.println("Evandro realiza curso de'");
		for(Curso c:a1.getCursos())
		{
			System.out.println( c.getNome());
			
			
		}
	}
	
	
}
