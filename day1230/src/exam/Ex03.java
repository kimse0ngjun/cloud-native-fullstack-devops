package exam;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		
//		int max = num[0];
		int max = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 5개를 차례대로 입력하세요 : ");
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if (num[i] > max) { // 큰 값 구하는 알고리즘
				max = num[i];
			}
		}
		System.out.println("5개 정수 중 가장 큰 값은 " + max + "입니다.");
	}
}
