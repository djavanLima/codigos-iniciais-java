package br.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {

	
	
	public static Connection getConexao() 
	{
		try {
		 final String url="jdbc:mysql://localhost/curso_java?serverTimezone=UTC&&verifyServerCertificate=false&&useSSL=true";
		 final String usuario="root";
		 final String senha = "";
		
		
			return DriverManager.getConnection(url,usuario,senha);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
		
	}
	
	
	
	
	
}
