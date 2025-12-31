package exam.ex01;

import java.util.Scanner;

public class ScoreRun {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Score score = new Score();
		
		System.out.print("국어, 수학, 영어 3과목의 점수를 각각 입력하세요 : ");
		
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int eng = sc.nextInt();
		
		score.sum(kor, math, eng);
		System.out.println("총점: " + score.sum(kor, math, eng) + "점입니다.");
		
	}
}
