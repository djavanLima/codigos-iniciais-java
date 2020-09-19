package br.com.oo.vendaroupa;

public class Divida {

	
	private String  descricao;
	private double valor;
	
	
	
	
	
	
	
	
	public String atualizaDescricao(String Descricao) {
		setDescricao(Descricao);
		
		return "Descricao atualizada com sucesso";
	}
	
	// metodo de pagamento parcelado
	public void av(double valorAv) 
	{
		
		double result= getValor()-valorAv;
		
		setValor(result);
		
		
	}
	//adiciona o valor da divida
	public void adicionarDivida(double valorDivida) 
	{	double result=getValor()+valorDivida;
		setValor(result);
	}
	
	
	
	
	public String getDescricao() {
		return descricao;
	}




	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}




	public double getValor() {
		return valor;
	}




	public void setValor(double valor) {
		this.valor = valor;
	}




	
	
	
	
	
}
