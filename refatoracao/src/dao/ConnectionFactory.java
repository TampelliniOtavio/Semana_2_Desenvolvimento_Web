package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection obtemConexao() throws SQLException {
		return DriverManager
				.getConnection("jdbc:mysql://localhost/pais?user=root&password=Otavio1!&serverTimezone=America/Sao_Paulo&useSSL=false");
	}


}
