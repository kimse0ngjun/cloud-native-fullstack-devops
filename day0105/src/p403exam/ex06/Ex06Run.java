package p403exam.ex06;

public class Ex06Run {

	public static void main(String[] args) {
		Student st = new Student(260105, "김성준");
		String studentInfo = st.toString();
		System.out.println(studentInfo);
		System.out.println(st);
//		System.out.println(st);
//		System.out.println(st.toString());
	}

}
