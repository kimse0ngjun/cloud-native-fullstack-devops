package cloud;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public static void setInstance(Singleton instance) {
		Singleton.instance = instance;
	}

	private Singleton() { // 기본 생성자
	
	}
}
