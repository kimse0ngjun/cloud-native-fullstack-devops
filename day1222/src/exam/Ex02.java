package exam;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 * 문제2. 아래와 같이 2개의 정수를 입력 받아 출력하는 자바프로그램을 작성하여 보시오.
			- 출력예 -
			두 정수를 입력하세요 : 10 3
			나눗셈 연산식은 10 / 3 = 3.333입니다.
		 */
		System.out.print("두 정수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		
		float result = (float) a / b;
		
		System.out.printf("나눗셈 연산식은 : %d/%d = %.2f입니다.", a, b, result);
		
	}
}
