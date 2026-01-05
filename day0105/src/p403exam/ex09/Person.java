package p403exam.ex09;

public class Person {
	
	private String name;
	private int age;
	
	public Person() { // 기본 생성자
	}
	
	public Person(String name) { 
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Class getConStructors() throws ClassNotFoundException {
		return Class.forName("p403exam.ex09.Person");
	}
	
	public Class getMethods(){
		return Class.class;
	}
	
	public Class getFields() {
		return null;
	}
	
	
}
