package exam.ex01;

import java.util.Scanner;

public class calculatorExam {
	/*
	 - 출력예 -
	2개의 정수값을 입력하세요 : 8 5
	덧셈 : 13
	뺄셈 : 3
	곱셈 : 40
	나눗셈 : 1
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		System.out.print("2개의 정수값을 입력하세요 : ");
		
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("덧셈: " + cal.add(a, b));
		System.out.println("뺄셈: " + cal.sub(a, b));
		System.out.println("곱셈: " + cal.mul(a, b));
		System.out.println("나눗셈: " + cal.div(a, b));
		
//		int add = cal.add(a, b);
//		int sub = cal.add(a, b);
//		int mul = cal.add(a, b);
//		int div = cal.add(a, b);
		
//		System.out.println("덧셈: " + add);
//		System.out.println("뺄셈: " + sub);
//		System.out.println("곱셈: " + mul);
//		System.out.println("나눗셈: " + div);
	}
}
