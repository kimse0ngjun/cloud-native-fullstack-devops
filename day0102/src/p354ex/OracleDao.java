package p354ex;

public class OracleDao implements UserInfoDao {

	@Override
	public void driver() {
		System.out.println("OracleDao.driver() 실행");
	}

	@Override
	public void url() {
		System.out.println("OracleDao.url() 실행");
	}

	@Override
	public void username() {
		System.out.println("OracleDao.username() 실행");
	}

	@Override
	public void password() {
		System.out.println("OracleDao.password() 실행");
	}
	
}
