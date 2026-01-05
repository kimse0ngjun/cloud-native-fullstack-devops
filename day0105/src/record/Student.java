package record;

import java.util.Objects;

public class Student {
	
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} 
		
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		Student std = (Student)obj;
		
		return id == std.id && Objects.equals(name, std.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public String toString() {
		return "Student { " + "id=" + id + ", name= '" + name + '\'' + "}";
	}
	
	public static void main(String[] args) {
		Student stdLee1 = new Student(12345, "이순신");
		Student stdLee2 = new Student(12346, "김장군");
		
		System.out.println("stdLee1 = " + stdLee1 + ", stdLee2 = " + stdLee2);
		System.out.println("stdLee1.equals(stdLee2) = " + stdLee1.equals(stdLee2));
		stdLee1.setName("김유신");
		System.out.println(stdLee1.getName());
	}

	public void doubleValue() {
		
	}
}
