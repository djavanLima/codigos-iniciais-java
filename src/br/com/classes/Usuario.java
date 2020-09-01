package br.com.classes;

public class Usuario {

	String nome;
	String email;
	
	Usuario()
	{}
	
	Usuario( String nome, String email)
	{
		setEmail(nome);
		setNome(email);
		
	}
	
	//implmentação do metodo equals
	public boolean 	equals(Object objeto)
	{
		//conversão do usuario em objeto
		Usuario outro=(Usuario) objeto;
		//aqui utilizo os criterios de comparacao
		if(objeto instanceof Usuario) {
		boolean nomeIgual=outro.nome.equals(getNome());
		boolean  emailIgual=outro.email.equals(getEmail());
		return nomeIgual && emailIgual;
		}
		else
		{
			return false;
			
		}
		
	}

	
	
	
	
	
	
	
	
	//getters e setters
	public String getNome()
	{
		return this.nome;
	}
	public void setNome(String nome) 
	{
		this.nome=nome;
	}
	public String getEmail(	)
	{
		return this.email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
}
