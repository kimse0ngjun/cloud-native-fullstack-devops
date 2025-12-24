package cloud;

public class Student {
	
	public Student() { // 기본 생성자는 명시하지 않아도 자동으로 생성
		
	}
	// 변수 선언 후 초기화
	int snum = 20250001;
	String name = "홍길동";
	int test; //
	
	// 접근 제한자: public > protected > default > private 
	//			public(패키지 어디서나 생성자 호출가능), 
	//			protected(현재 패키지에서만 생성자 호출가능, 다른 패키지에 자식클래스가 있을 경우 자식 클래스 생성자 호출가능), 
	//			default(현재 패키지에서만 생성자 호출가능), 
	//			private(클래스내에서만 생성자 호출가능)
}

class Car { // default 형태
	 public Car() { // 기본 생성자 -> 멤버 변수임
		
	}
	
	String color = "red"; // 멤버 변수(메서드)
	String type = "sedan";
}

class Person { // 클래스의 첫글자는 대문자
	public Person() { // 생성자 - 소문자로 적으면 인식을 못함
	} 
	
	public void person() { // 메서드 
 		
	}
}


//public class car{ 
//	
//}
