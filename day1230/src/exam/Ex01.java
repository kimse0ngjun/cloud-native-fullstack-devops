package exam;

import java.util.Scanner;

public class Ex01 {
	/*
	 문제1. 국어, 영어, 수학점수와 합계를 출력하는 자바프로그램을 작성하여 보시오. 단, 과목(배열명 : score)을 배열로 처리하여 풀이하시오.
	-출력예 -
	국어, 영어, 수학 점수를 차례대로 입력하세요 : 85 95 70
	국어 : 85점, 영어 : 95점, 수학 : 70점
	세 과목의 합계는 250점이고 평균은 83.3333점입니다.
	
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int kor = sc.nextInt();
//		int eng = sc.nextInt();
//		int math = sc.nextInt();
//		int[] score = new int[] {kor, eng, math};
		int[] score = new int[3];
		int sum = 0;
		double avg;
//		String str = String.format("%.3f", avg);
		System.out.print("국어, 영어, 수학 점수를 차례대로 입력하세요 : ");
		for (int i = 0; i < score.length; i++) {
			score[i] = Integer.parseInt(sc.nextLine());
//			System.out.println("국어 : " + kor + "점 영어 : " + eng + "점 수학 : " + math + "점");
			sum = sum + score[i];
			avg = (double) sum / 3;
//			System.out.println("세 과목의 합계는 " + sum + "점이고 평균은 " + avg + "점입니다.");
		}
		System.out.println("국어 : " + score[0] + "점 영어 : " + score[1] + "점 수학 : " + score[2] + "점");
		
		avg = (double) sum / 3;
		System.out.println("세 과목의 합계는 " + sum + "점이고 평균은 " + avg + "점입니다.");
		
	
	}
}
