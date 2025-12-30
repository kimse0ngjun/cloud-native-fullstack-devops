package exam;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		float[] num = new float[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("실수 5개를 차례대로 입력하세요 : ");
		num[0] = sc.nextFloat();
		float min = num[0];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextFloat();
			if (min > num[i]) { // min > num[i]
				min = num[i];
			}
		}
		System.out.println("5개 실수 중 가장 작은 값은 " + min + "입니다.");
	}
}
