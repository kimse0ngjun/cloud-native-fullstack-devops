package mysqlexam.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil { // MysqlDB 연결 보조 프로그램

	private static final String URL = "jdbc:mysql://localhost:3306/mysqlexam";
	private static final String USER = "root";
	private static final String PASSWORD = "1111";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
