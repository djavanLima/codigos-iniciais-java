package br.com.oo.conta;

public class testeConta {

	public static void main(String[] args) {
		
		
		
		Conta conta=new Conta("Djavan Ferreira Lima",3000);
		Conta conta2=new Conta("Luana Marinho Calheiros",0000.00);
		
		conta.mostrarSaldo();
		conta2.mostrarSaldo();
		
		conta.transferencia(conta2, 200.00);
		
		
		conta.mostrarSaldo();
		conta2.mostrarSaldo();
		
		conta2.transferencia(conta, 200);
		
		conta.mostrarSaldo();
		conta2.mostrarSaldo();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
}
