package cloud;

public class Second {
	public static void main(String ar[]) {
		
		int num = 100; // 타입이 들어간 변수가 우선순위
		num = 200;
		String Str = "100";
		Str = "Hello";
		
		System.out.println("num = " + num);
		System.out.println("Str = " + Str);
		System.out.println("num = " + num + ", Str = " + Str);
//		String str = 1000;
//		int num;
//		int num = "100";
		// 변수 선언 - 데이터 저장공간, 자료형(숫자, 문자, 날짜, 객체), 
		// 변수 중복 x
	}
}
