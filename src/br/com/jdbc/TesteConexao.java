package br.com.jdbc;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class TesteConexao {

	
	public static void main(String[] args)  throws SQLException{
		
		
		
		//The server time zone value 'Hora Padr?o de Caracas' is unrecognized
		//or represents more than one time zone. You must configure either the 
	//	server or JDBC driver (via the 'serverTimezone' configuration property)
		//to use a more specifc time zone value if you want to utilize time zone support.
		
		//configuração do servidor de hora ?serverTimezone=UTC
		//?serverTimezone=UTC tambem se usa depois do esquema
		
		final String url="jdbc:mysql://localhost?serverTimezone=UTC&&verifyServerCertificate=false&&useSSL=true";
		final String usuario="root";
		final String senha ="";
		
		Connection conexao =DriverManager
				.getConnection(url,usuario, senha);
		System.out.println("Conexão realizada com sucesso!!");
		conexao.close();
		
	}
	
}
