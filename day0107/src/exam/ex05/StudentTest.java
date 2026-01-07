package exam.ex05;

import java.util.HashSet;

public class StudentTest {
	
	static HashSet<Student> hset = new HashSet<Student>();
	
	public static void showAllStudent() {
		for (Student student : hset) {
			System.out.println(student);
			
		}
		System.out.println("============= [end] =============");
	}
	

	public static void main(String[] args) {
		
		hset.add(new Student("100", "홍길동"));
		hset.add(new Student("200", "강감찬"));
		hset.add(new Student("300", "이순신"));
		hset.add(new Student("400", "정약용"));
		hset.add(new Student("100", "송중기"));
		
		StudentTest.showAllStudent();
		
//		System.out.println(set);
		
		
	}

}
