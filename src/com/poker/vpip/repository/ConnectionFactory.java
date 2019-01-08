package com.poker.vpip.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static String url = "jdbc:mysql://localhost:3306/VPIP";
	private static String username = "java";
	private static String password = "java";
	
	
	public static void setInstance(String u, String user, String pass) {
		url = u;
		username = user;
		password = pass;
	}
	
	public static Connection getInstance() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}
}
