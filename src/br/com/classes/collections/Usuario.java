package br.com.classes.collections;

public class Usuario {

	private String nome;
	private String email;
	
	
	public Usuario()
	{
		
	}
	
	public Usuario(String nome,String email)
	{
		setNome(this.nome);
		setEmail(this.email);
		
	}
	
	
	
	
	
	
	public String toString()
	{
		return "Meu nome �" + getNome()+".";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void setNome(String nome)
	{
		this.nome=nome;
	}
	public String getNome()
	{
		return this.nome;
	}
	
	public void setEmail( String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return this.email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
