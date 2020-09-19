package br.com.oo.vendaroupa;

public class Cliente {

	private String nome;
	private String cpf;
	private String telefone;
	
	private Divida divida;
	
	
	
	
	
	
	Cliente()
	{
		this.divida=new Divida();
	}
	Cliente(String nome, String cpf,String telefone)
	{
		this.divida=new Divida();
		setNome(nome);
		setCpf(cpf);
		setTelefone(telefone);
		
		
	}
	
	public void adicioanarCliente( String nome, String cpf,String telefone)
	{
		setNome(nome);
		setCpf(cpf);
		setTelefone(telefone);
	}
	
	
	
	
	
	
	
	public Divida getDivida() {
		return divida;
	}
	public void setDivida(Divida divida) {
		this.divida = divida;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
