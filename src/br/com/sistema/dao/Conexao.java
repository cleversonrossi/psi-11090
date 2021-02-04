package br.com.sistema.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.sistema.excecao.SistemaException;

public class Conexao {

	public static Connection conn;
	
	public static Connection getConnection() throws SistemaException, SQLException{
		
		//Relaiza conexão com o banco de dados mysql
		if(conn == null || conn.isClosed()){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/pedido?user=root&password=admin";
				conn = DriverManager.getConnection(url);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new SistemaException(e.getMessage());
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
				throw new SistemaException(e.getMessage());
			}
		}
		return conn;
	}

}