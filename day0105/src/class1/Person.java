package class1;

public class Person {

	private String name;
	private int age;
	
	// public person() {} 기본 생성자
	
	public String getName() { // 출력
		return name;
	}
	
	public void setName(String name) { // 입력
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
