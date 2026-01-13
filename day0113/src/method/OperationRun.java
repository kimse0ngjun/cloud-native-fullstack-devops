package method;

import java.util.Scanner;

import inherit.Remainder;

public class OperationRun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Operation op = new Operation();
		Remainder re = new Remainder();
		System.out.println("2개의 실수값을 입력하세요 : ");
		
		double num1 = Double.parseDouble(sc.nextLine());
		double num2 = Double.parseDouble(sc.nextLine());
		
		double sum = op.sum(num1, num2);
		double sub = op.sub(num1, num2);
		double mul = op.mul(num1, num2);
		double div = op.div(num1, num2);
		int rem = re.rem((int)num1, (int)num2);
		
		System.out.println("덧셈 : " + sum);
		System.out.println("뺄셈 : " + sub);
		System.out.println("곱셈 : " + mul);
		System.out.println("나눗셈 : " + div);
		System.out.println("나머지 : " + rem);

	}

}
