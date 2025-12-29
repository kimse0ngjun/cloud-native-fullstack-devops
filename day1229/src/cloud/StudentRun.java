package cloud;

public class StudentRun { // 실행 클래스
	
	public int sum() { // 인스턴스 멤버
		return 100;
	}
	
	public static int minus() {
		return 100;
	}

	public static void main(String[] args) {
		
		// 인스턴스 멤버
		StudentRun sr = new StudentRun(); // 인스턴스 멤버는 객체를 생성해야된다.
		sr.sum();
		
		// static 멤버
		StudentRun.minus();
		
		
		// Student 객체 생성 ==> Student 데이터를 사용하겠다.
		// 1. 클래스 타입 선언, 2. 변수 작성, 3. new 연산자 사용, 4. 생성자 호출
		// 1.
		Student st1 = new Student(); // 객체 생성
//		st1.num = 1;
		st1.getStudentId();
		st1.setStudentId(250002);
		st1.setName("응애");
		int studentId = st1.getStudentId();
		String name = st1.getName();
		System.out.println("========================");
		System.out.println("studentId = " + studentId);
		
//		Student.getSerialNum(); // static 멤버
//		st1.getSerialNum(); // 인스턴스 멤버
		
		Student st3 = new Student();
		
		// 2.
//		Student st2 = new Student(250001, "홍길동"); // 객체 생성, 오버로딩 
		// 250001, "홍길동" -> 속성
//		int studentId = st2.getStudentId();
//		String name = st2.getName();
		
		// 인스턴스 멤버 방법 처리(객체를 생성하지 않으면 사용할 수 없다.)
		st1.setSerialNum(00001); // static 멤버는 지금처리 인스턴스로 처리 x
		int serialNum = st1.getSerialNum(); // static 멤버는 지금처리 인스턴스로 처리 x
		System.out.println("Student st1.serialNum= " + serialNum);
		
		// static 멤버 방법 처리(클래스 이름을 쓰고 메서드를 호출해서 사용)
		Student.setSerialNum(00002);
		int serialNum1 = Student.getSerialNum(); // 같은 참조값
		System.out.println("Student serialNum= " + serialNum1);
		
		System.out.println("studentId = " + studentId + ", name = " + name);
		System.out.println("Student st1= " + st1.toString());
		System.out.println("Student st3= " + st3.toString()); // st1과 참조값이 다름
	}
}
