package br.com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import br.com.oo.desafio.Aluno;

public class Filter {

	
	public static void main(String[] args) {
		
		Aluno a =new Aluno("Ana",7.8);
		
		Aluno a2 =new Aluno("Bia",7.8);
		Aluno a3=new Aluno("Daniel",7.8);
		Aluno a4 =new Aluno("Gabriel",7.8);
		Aluno a5 =new Aluno("Rebeca",7.8);
		Aluno a6 =new Aluno("Pedro",7.8);
		
		
		List<Aluno> alunos=Arrays.asList(a,a2,a3,a4,a5,a6);
		Predicate<Aluno> isPassou= al -> al.getNota1() >=7;//retorna true or false
		Function <Aluno,String> aprovados=s-> "parabens você foi "+ s.getNome()+ " aprovado Reprovado";
		
		
		
		alunos.stream()
					.filter(isPassou)
					.map(aprovados)
					.forEach(System.out::println);
		
		
	}
	
}
