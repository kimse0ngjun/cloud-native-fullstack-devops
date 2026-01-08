package stream;

import java.util.Objects;

public class Student {

	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
		// return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} 
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Student std = (Student) obj;
		return id == std.id;
	}
}
