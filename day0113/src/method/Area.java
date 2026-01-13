package method;
/*
	 문제3. 사용자로부터 원의 반지름을 입력받아서 원의 둘레와 면적을 출력하는 자바프로그램을 작성하시오. 원의 반지름은 실수로 하며 원주율(3.14)은 상수 정의하시오. 단, 원의 둘레와 면적을 계산하는 부분은 메소드로 처리함. (매개변수 1개 (반지름), 리턴값 실수값)
	- 출력예 -
	원의 반지름을 입력하세요 : 5.0
	원의 둘레는 31.40이며 원의 면적은 78.50입니다.
public class Area {
	
	final double PI = 3.14;
	
	//메서드 작성 : double circumferenceCicle(double r), double AreaCicle(double r) 
}

 */
public class Area {
	
	final double PI = 3.14;
	
	public double circumferenceCircle(double r) {  // 둘레
		
		return 2 * PI * r;
	}
	
	public double AreaCircle(double r) { // 넓이
		
		return PI * r * r;
	}
	
	
}
