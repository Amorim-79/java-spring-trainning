package br.com.amorim.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListData {
	
public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().getConnection();
		
		Statement statement = connection.createStatement();
		statement.execute("SELECT * FROM product");
		ResultSet result = statement.getResultSet();
		
		while(result.next()) {
			System.out.println("id:" + result.getInt("id"));
			System.out.println("name:" + result.getString("name"));
			System.out.println("description:" + result.getString("description"));
		}
		
		connection.close();
		
	}
}
