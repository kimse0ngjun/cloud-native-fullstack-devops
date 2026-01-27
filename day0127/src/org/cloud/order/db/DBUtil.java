package org.cloud.order.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
	private static final String URL = "jdbc:mysql://localhost:3306/querystudy";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "1111";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
