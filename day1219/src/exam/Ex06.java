package exam;

public class Ex06 {
	public static void main(String arg[]) {
		/*
		 * 문제6. 아래의 출력예와 같이 출력하는 자바프로그램을 작성하여 보시오.
			- 출력예 -
			두 개의 정수 10과 20의 합은 30, 차는 -10, 곱은 200입니다.
		 */
		int a = 10;
		int b = 20;
		
		int add = a + b;
		int sub = a - b;
		int multifly = a * b;
		
		System.out.println("두 개의 정수 " + a + "와 " + b + "의 합은 " + add + ", 차는 " + sub + ", 곱은 " + multifly + "입니다.");
	}
}
