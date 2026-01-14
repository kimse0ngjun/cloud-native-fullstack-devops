package exam.ex01;

import java.util.Scanner;

public class IntEx1 {

	public static void main(String[] args) {
	
	
		
		Scanner sc = new Scanner(System.in);
		IntName ine = new IntName(); 
		System.out.print("2개의 정수값을 입력하세요 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		int num2 = Integer.parseInt(sc.nextLine());
		
		int add1 = ine.add(num1, num2);
		int minus1 = ine.minus(num1, num2);
		int mul1 = ine.mul(num1, num2);
		int div1 = ine.div(num1, num2);
		
		System.out.println("덧셈 : " + add1);
		System.out.println("뺄셈 : " + minus1);
		System.out.println("곱셈 : " + mul1);
		System.out.println("나눗셈 : " + div1);
		
	}
}
