package br.com.classes.collections;

import java.util.HashSet;
import java.util.Set;

public class HeshSetBaguncado {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nao aceita volores repetidos
		HashSet conjunto= new HashSet();
		
		conjunto.add(1.2); // insere, entretanto converte o double em class Double
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add('x');
		//tamanho a lista
		System.out.println(conjunto.size());
		System.out.println(conjunto.remove("Teste"));
		//procura valor 
		System.out.println(conjunto.contains('x'));
		
		Set nums= new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		// junta os conjuntos
		conjunto.addAll(nums);
		
		System.out.println("conjunto" + conjunto);
		// retira o conjunto adicionado
		conjunto.retainAll(nums);
		// limpa o conjunto
	}

}
