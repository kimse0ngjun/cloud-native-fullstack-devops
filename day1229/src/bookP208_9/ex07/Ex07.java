package bookP208_9.ex07;

public class Ex07 {
	
	private Ex07() {} // 생성자를 private로 접근시키는 것 // 1
	
	private static Ex07 instance = new Ex07(); // 생성자 처리 // 2

	public static Ex07 getInstance() { // 3
		if (instance == null) {
			instance = new Ex07();
		}
		return instance;
	}
}
