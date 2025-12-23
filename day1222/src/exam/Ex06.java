package exam;

import java.util.Scanner;

public class Ex06 {
	public static void main(String args[]) {
		/*
		 * 문제6. 정수 세 개의 곱을 구하여 출력하는 자바프로그램을 작성하여 보시오.
			- 출력예 -
			세 개의 정수를 입력하세요 : 2 30 40
			정수 2, 30, 40의 곱은 2400입니다.
		 */
		System.out.print("세 개의 정수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		
		// 1
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a * b * c;
		
		System.out.println("정수 " + a + "," + b + "," + c + "의 곱은 " + sum + "입니다.");
	}
}