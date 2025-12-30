package exam.ex09;

public class StudentArrayRun {
	public static void main(String[] args) {
		
		Student[] st = new Student[3];
		
		st[0] = new Student(1001, "홍길동");
		st[1] = new Student(1002, "이순신");
		st[2] = new Student(1003, "강감찬");
		
		for (Student student : st) {
			student.showStudentInfo();
		}
	}
}
