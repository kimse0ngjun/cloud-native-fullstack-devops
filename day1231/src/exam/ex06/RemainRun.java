package exam.ex06;

import java.util.Scanner;

import exam.ex05.Arithmetic;

public class RemainRun {
	/*
	 문제6. 문제5에서 나머지를 출력하는 기능을 상속을 이용하여 자식클래스를 출력하는 자바프로그램을 작성하여 보시오.
	 */
	public static void main(String[] args) {
		Arithmetic ari = new Arithmetic();
		Remain re = new Remain();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2개의 값을 입력하세요 : ");
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		
		int add1 = ari.add(a, b);
		int minus1 = ari.minus(a, b);
		int multiply1 = ari.multiply(a, b);
		int divide1 = ari.divide(a, b);
		int remain1 = re.remain(a, b);
		
		
		System.out.println("덧셈 : " + add1);
		System.out.println("뺄셈 : " + minus1);
		System.out.println("곱셈 : " + multiply1);
		System.out.println("나눗셈 : " + divide1);
		System.out.println("나머지 : " + remain1);
	}
}
