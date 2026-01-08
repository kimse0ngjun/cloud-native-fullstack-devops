package stream;

import java.util.ArrayList;
import java.util.List;

public class DistinctRun {

	public static void main(String[] args) {

		
		Student std1 = new Student(100, "홍길동");
		Student std2 = new Student(200, "이순신");
		Student std3 = new Student(300, "강감찬");
		Student std4 = new Student(100, "홍길동");
		
		List<Student> stdList = new ArrayList<Student>();
		stdList.add(std1);
		stdList.add(std2);
		stdList.add(std3);
		stdList.add(std4);
		
		stdList.stream().distinct().forEach(s -> System.out.println(s.getName()));
		// distinct() -> 중복제거
	}

}
