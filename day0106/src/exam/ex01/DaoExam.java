package exam.ex01;

public class DaoExam {
	
	public static void main(String[] args) {
//		MySQLDAO mysql = new MySQLDAO();
//		OracleDao oracle = new OracleDao();
		DataAccessObject mysql = new MySQLDAO();
		DataAccessObject oracle = new OracleDao();
		
		mysql.select();
		mysql.insert();
		mysql.update();
		mysql.delete();
		
		oracle.select();
		oracle.insert();
		oracle.update();
		oracle.delete();
		
		 
	}
} 
