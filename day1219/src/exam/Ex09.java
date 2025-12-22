package exam;

public class Ex09 {
	
	public static void main(String arg[]) {
		/*
		 * 문제9. 달의 중력은 지구의 약 17%라고 한다. 자신의 몸무게가 70kg이라고 할 때 달에서의 몸무게를 계산하는 자바프로그램을 작성하시오.
			- 출력예 -
			달에서의 몸무게는 11.9kg입니다.
		 */
		int body = 70;
		int earth = body;
		double moon = (double) earth * 17 / 100; // * 0.17
		
		System.out.println("달에서는 몸무게는 " + moon + "kg입니다.");
	}
}
