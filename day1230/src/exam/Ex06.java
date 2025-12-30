package exam;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] scores = new int[3][5]; // 성적, 총점
		double[] avg = new double[3]; // 평균
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1) + "번 학생의 4과목 성적을 차례대로 입력하세요 : ");
			
			for (int j = 0; j < 4; j++) {
				scores[i][j] = Integer.parseInt(sc.nextLine());
				scores[i][4] = scores[i][4] + scores[i][j];
			}
			
			avg[i] = scores[i][4] / 4.0;
		}
		System.out.println();
		System.out.println("================ 성적 출력 ==================");
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1) + "번 학생의 총점은 " + scores[i][4] + "점이고 평균은 " + avg[i] + "점입니다.");
		}
	}
}
