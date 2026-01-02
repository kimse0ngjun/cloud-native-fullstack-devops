package p354ex;

public class MysqlDao implements UserInfoDao {

	@Override
	public void driver() {
		System.out.println("MysqlDao.driver() 실행");
	}

	@Override
	public void url() {
		System.out.println("MysqlDao.url() 실행");
	}

	@Override
	public void username() {
		System.out.println("MysqlDao.username() 실행");
	}

	@Override
	public void password() {
		System.out.println("MysqlDao.password() 실행");
	}

}
