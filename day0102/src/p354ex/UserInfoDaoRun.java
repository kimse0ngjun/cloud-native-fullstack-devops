package p354ex;

public class UserInfoDaoRun {

	public static void main(String[] args) {

		UserInfoDao uid1 = new OracleDao();
		UserInfoDao uid2 = new MssqlDao();
		UserInfoDao uid3 = new MysqlDao();

		// 1.
//		uid1.driver();
//		uid1.url();
//		uid1.password();
//		uid1.username();
		
		uid1.templeteMethod();

//		uid2.driver();
//		uid2.url();
//		uid2.password();
//		uid2.username();

		uid2.templeteMethod();
		
//		uid3.driver();
//		uid3.url();
//		uid3.password();
//		uid3.username();
		
		uid3.templeteMethod();
		
	}

}
