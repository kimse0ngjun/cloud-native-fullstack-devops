package inherit;

import java.util.Scanner;

public class OperationRun {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
//		Operation op = new Operation();
		Remainder rm = new Remainder();
		System.out.println("2개의 정수 값을 입력하세요 : ");
		
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		
		int a1 = rm.add(a, b);
		int b1 = rm.minus(a, b);
		int c1 = rm.mul(a, b);
		int d1 = rm.div(a, b);
		int rem = rm.rem(a, b);
		
		System.out.println("덧셈 : " + a1);
		System.out.println("뺄셈 : " + b1);
		System.out.println("곱셈 : " + c1);
		System.out.println("나눗셈 : " + d1);
		System.out.println("나머지 : " + rem);
	}

}
