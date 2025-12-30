package cloud;

public class Student {
	
	int studentId;
	String name;
	
	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("studentId = " + studentId + ", name = " + name);
	}
}
