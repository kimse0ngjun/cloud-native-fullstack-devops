package cloud;

import java.util.Scanner;

public class ScoreRun {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("국어, 수학, 영어 점수를 차례대로 입력하세요 : ");
		
		int kor = Integer.parseInt(sc.nextLine());
		int math = Integer.parseInt(sc.nextLine());
		int eng = Integer.parseInt(sc.nextLine());
		
		Score score = new Score();
		int sum = score.total(kor, math, eng);
		System.out.println("총점: " + sum + "점");
		
		double average = score.avg(kor, math, eng);
		System.out.println("평균: " + average + "점");
		
	}
}
