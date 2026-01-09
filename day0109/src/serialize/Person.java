package serialize;

import java.io.Serializable;

public class Person implements Serializable { // 직렬화하겠다는 의도

	private static final long serialVersionUID = 1L;
	String name;
	String job;
	
	public Person() {
		
	}

	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	
	@Override
	public String toString() {
		
		return name + ", " + job;
	}
}
