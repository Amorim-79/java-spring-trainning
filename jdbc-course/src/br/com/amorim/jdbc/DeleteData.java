package br.com.amorim.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {

public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().getConnection();
		
		Statement statement = connection.createStatement();
		statement.execute("DELETE FROM product WHERE id LIKE '2'");
		connection.close();
		
	}
}
