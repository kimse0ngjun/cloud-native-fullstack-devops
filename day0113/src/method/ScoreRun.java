package method;

import java.util.Scanner;

public class ScoreRun {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 수학, 영어 3과목의 점수를 각각 입력 : ");
		
		int kor = Integer.parseInt(sc.nextLine());
		int mat = Integer.parseInt(sc.nextLine());
		int eng = Integer.parseInt(sc.nextLine());
		
		Score s = new Score(kor, mat, eng);
		
		int sum = s.total();
		double avg = s.average();
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
