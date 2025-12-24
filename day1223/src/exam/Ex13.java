package exam;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i < a+1; i++) {
			sum = sum + i;
		}
		System.out.print("합계: " + sum);
	}
}

