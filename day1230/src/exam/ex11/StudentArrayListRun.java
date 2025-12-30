package exam.ex11;

import java.util.ArrayList; // 인터페이스

public class StudentArrayListRun {
	public static void main(String[] args) {
		
		ArrayList<Student> std = new ArrayList<Student>();
		std.add(new Student(1001, "홍 길 동"));
		std.add(new Student(1002, "이 순 신"));
		std.add(new Student(1003, "강 감 찬"));
		
		for (int i = 0; i < std.size(); i++) {
				std.get(i).showStudentInfo();
		}
	}
}
