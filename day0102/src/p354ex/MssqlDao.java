package p354ex;

public class MssqlDao implements UserInfoDao {

	@Override
	public void driver() {
		System.out.println("MssqlDao.driver() 실행");
	}

	@Override
	public void url() {
		System.out.println("MssqlDao.url() 실행");
	}

	@Override
	public void username() {
		System.out.println("MssqlDao.username() 실행");
	}

	@Override
	public void password() {
		System.out.println("MssqlDao.password() 실행");
	}

}
