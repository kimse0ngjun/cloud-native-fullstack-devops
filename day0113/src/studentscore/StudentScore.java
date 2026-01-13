package studentscore;

import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {
		
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		
		int[] scores = null; //
		int max = 0;
		
		int sum = 0;
		double avg;

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수  | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택 > ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch (num) {
			case 1:
				System.out.print("학생수 입력 : ");
				int studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				System.out.println("학생수 > " + studentNum);
				break;
				
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores [" + i + "] > ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
				break;
				
			case 3: // 점수 리스트
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores [" + i + "] > " + scores[i]);
				}
				break;
			case 4:
//				for (int i = 0; i < scores.length; i++) { 
//					if (scores[i] > max) { // 최고 점수
//						max = scores[i];
//					} 
//				}		
				for (int i = 0; i < scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max;
					sum += scores[i];
				}
				System.out.println("최고 점수 = " + max);
				avg = (double) sum / scores.length; // 평균
				System.out.println("평균 : " + avg);
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
			}
		}
	}
}
