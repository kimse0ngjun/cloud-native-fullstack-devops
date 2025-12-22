package input;

import java.util.Scanner;

public class Keyboard2 {

	public static void main(String[] args) {
		
		System.out.print("첫번째 숫자 입력 = ");
		Scanner sc1 = new Scanner(System.in); // 숫자 형식만 입력
		int num1 = Integer.parseInt(sc1.nextLine()); // 숫자 형식만 입력 가능
		
		System.out.print("두번째 숫자 입력 = ");
		Scanner sc2 = new Scanner(System.in);
		int num2 = Integer.parseInt(sc2.nextLine());
		
		int sum = num1 + num2;
		
		System.out.println("sum = " + sum);
	}

}
