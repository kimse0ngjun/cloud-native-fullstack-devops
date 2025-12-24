package exam;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 문제3. 국어, 영어, 수학 점수를 입력받아 평균점수가 60점 이상이면 "합격", 60점 미만이면 "불합격"이라고 출력하는 자바프로그램을 작성하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어, 영어, 수학 점수를 차례대로 입력해주세요 : ");
		
		int korean = sc.nextInt();
		int math = sc.nextInt();
		int eng = sc.nextInt();
		int sum = korean + math + eng;
		
		double avg = (double) sum / 3;		
		if (avg < 60) {
			System.out.print("불합격");
		} else {
			System.out.print("합격");
		}
	}
}
