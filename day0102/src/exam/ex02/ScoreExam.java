package exam.ex02;

import java.util.Scanner;

public class ScoreExam {
	/*
	 -출력예 -
	국어, 영어, 수학 점수를 차례대로 입력하세요 : 85 95 70
	국어 : 85점, 영어 : 95점, 수학 : 70점
	세 과목의 합계는 250점이고 평균은 83.3333점입니다.

	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Score se = new Score();
		System.out.println("국어, 영어, 수학 점수를 차례대로 입력하세요 : ");
		
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		double avg = (double) (a + b + c) / 3;
//		int total = se.sum(a, b, c);
//		double avg = se.avg(total);
		System.out.println("국어: " + a + "점 영어: " + b + "점 수학: " + c + "점");
		System.out.println("세 과목의 합계는 " + se.sum(a, b, c) + "이고 평균은 " + (double) avg + "점입니다.");
		
		
	}
}
