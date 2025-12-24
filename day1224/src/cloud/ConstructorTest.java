package cloud;

public class ConstructorTest {
	
	private int num;
	private String name;
	
	public ConstructorTest() {
	}
	
	public ConstructorTest(int num, String name) { // 명시적 생성자
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}
}
