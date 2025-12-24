package exam;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		/*
		 문제7. 2개의 정수를 입력받아 해당하는 번호를 선택하면 사칙연산을 하는 자바프로그램을 작성하여 보시오. (if~else if~else 또는 switch~case 중 선택)
		- 출력예 -
		2개의 정수를 입력하세요 : 20 30
		사칙연산을 선택하세요. (1) 덧셈 (2) 뺄셈 (3) 곱셈 (4) 나눗셈 (5) 종료
		1
		입력하신 정수의 덧셈은 50입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2개의 정수를 입력하세요 : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result = 0;
		
		System.out.println("사칙연산을 선택하세요. (1) 덧셈 (2) 뺄셈 (3) 곱셈 (4) 나눗셈 (5) 종료");
		int choice = sc.nextInt();
//		while (true) {
//			System.out.println("사칙연산을 선택하세요. (1) 덧셈 (2) 뺄셈 (3) 곱셈 (4) 나눗셈 (5) 종료");
//			int choice = sc.nextInt();
//			
//			if (choice == 5) {
//				break;
//			}
			
			switch (choice) {
			case 1:
				result = num1 + num2;
				System.out.println("입력하신 정수의 덧셈은 " + result + "입니다.");
				break;
			case 2:
				result = num1 - num2;
				System.out.println("입력하신 정수의 뺏셈은 " + result + "입니다.");
				break;
			case 3:
				result = num1 * num2;
				System.out.println("입력하신 정수의 곱셈은 " + result + "입니다.");
				break;
			case 4:
				if (num2 != 0) {
					result = num1 / num2;
					System.out.println("입력하신 정수의 나눗셈은 " + result + "입니다.");
				} else {
					System.out.println("2번째 입력한 숫자가 0입니다.");
				}
				break;
			case 5: System.out.print("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 입력입니다. (1~5 사이값만 입력)");
				break;
		} 
	}
}
