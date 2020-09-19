package br.com.oo.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	
	public static void main(String[] args) {
		
		
		//nao recebe um parametro e retorna um
		
		Supplier<List<String>> umList=
				()->Arrays.asList("Ana","Bia","Lia","Gui");
				//metodo que retorna um suplier
		System.out.println(umList.get());
	}
	
	
	
}
