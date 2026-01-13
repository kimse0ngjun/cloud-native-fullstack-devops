package inherit;

import java.util.Scanner;

public class ScoreRun {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
//		Score s = new Avg(); // 클래스 타입이 부모타입이면 자식 메소드는 사용할 수 없다.
		Avg s1 = new Avg();
		System.out.println("국어, 수학, 영어 3과목의 점수를 각각 입력 : ");
		
		int kor = Integer.parseInt(sc.nextLine());
		int math = Integer.parseInt(sc.nextLine());
		int eng = Integer.parseInt(sc.nextLine());
		
		int sumScore = s1.sum(kor, math, eng);
		double avg1 = s1.avg(sumScore);
		System.out.println("총점 : " + sumScore);
		System.out.println("평균 : " + avg1);
	}

}
