package br.com.amorim.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	Connection getConnection() throws SQLException {
		return DriverManager
				.getConnection("jdbc:mysql://localhost/JDBC_COURSE?useTimezone=true&serverTimezone=UTC", "root", "123456");
	}
}
