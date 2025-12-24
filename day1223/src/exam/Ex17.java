package exam;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, sum = 0;
		
		for (i = 1; i <= 3; i++) {
			System.out.print(i + "번 학생의 점수를 입력하세요 :");
			int score = Integer.parseInt(sc.nextLine());
			sum = sum + score;
		} 
		
		double avg = sum/3.0;
		String avg2 = String.format("%.1f", avg);
		System.out.println((i-1) + "의 점수 합계는 " + sum + "이고 평균은" + avg2 + "입니다.");
	}
}
