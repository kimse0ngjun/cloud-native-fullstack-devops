package exam.ex05;

import java.util.Scanner;

public class ArithmeticRun {
	/*
	문제5. 사용자로부터 정수값 2개를 입력받아서 덧셈, 뺄셈, 곱셈, 나눗셈 연산을 하여 출력하는 자바프로그램을 작성하시오. 단, 메소드를 사용하여 풀이하시오. 
	 */
	public static void main(String[] args) {
		Arithmetic ari = new Arithmetic();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2개의 값을 입력하세요 : ");
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		
		int add1 = ari.add(a, b);
		int minus1 = ari.minus(a, b);
		int multiply1 = ari.multiply(a, b);
		int divide1 = ari.divide(a, b);
		
		
		System.out.println("덧셈 : " + add1);
		System.out.println("뺄셈 : " + minus1);
		System.out.println("곱셈 : " + multiply1);
		System.out.println("나눗셈 : " + divide1);
	}
}
