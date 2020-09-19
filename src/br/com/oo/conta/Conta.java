package br.com.oo.conta;

public class Conta {

	
	private String nome;
	private double saldo;
	
	public void descontarSaldo(double valor) {
		double valorAtual=getSaldo()-valor;
		setSaldo(valorAtual);
	}
	//fun�ao de sacar
	public void sacar(double valor) {
		if(getSaldo()>0) {
			descontarSaldo(valor);
			System.out.println(" seu dinheiro ja est� sendo impresso "+getSaldo());
			
		}
		else {
			System.out.println("Infelizmente voc� n�o possui dinheiro em sua conta");
		}
	}
	//funcao para realizar deposito
	public void depositar(double valor)
	{	double valorAtual=getSaldo()+valor;
		setSaldo(valorAtual);
		
	}
	
	
	void mostrarSaldo( )
	{
		System.out.println("Senhor(a): " + getNome());
		System.out.println("Seu saldo �: "+ getSaldo() );
		
	}
	
	//metodo para fazer transferencia
	void transferencia(Conta destino ,double valor) {
		if(valor>0) {
		descontarSaldo(valor);
		destino.depositar(valor);
		System.out.println("Transfer�ncia realizada com sucesso");
		mostrarSaldo();
		}
		else {
			System.out.println("n�o foi possivel realizar dep�sito");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Conta(){}
	
	Conta(String nome, double valor){
		setNome(nome);
		setSaldo(valor);
	}
	
	String getNome()
	{
		return this.nome;
		
	}
	void setNome(String nome)
	{
		this.nome=nome;
	}
	
	double getSaldo()
	{
		return this.saldo;
	}
	void setSaldo(double saldo)
	{
		this.saldo=saldo;
	}

	
	
}
