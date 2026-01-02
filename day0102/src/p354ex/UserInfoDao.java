package p354ex;

public interface UserInfoDao {

	void driver();
	void url();
	void username();
	void password();
	
	default void templeteMethod() {
		driver();
		url();
		username();
		password();
	}
	
}
