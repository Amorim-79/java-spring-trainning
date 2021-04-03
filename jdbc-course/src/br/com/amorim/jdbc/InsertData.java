package br.com.amorim.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().getConnection();
		
		Statement statement = connection.createStatement();
		statement.execute("INSERT INTO product (name, description) VALUES ('Notebook', 'Notebook descrição')");
		connection.close();
		
	}
}
