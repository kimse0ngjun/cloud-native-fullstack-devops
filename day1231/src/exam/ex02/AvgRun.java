package exam.ex02;

import java.util.Scanner;

import exam.ex01.Score;

public class AvgRun {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Avg av = new Avg();
		
		System.out.print("국어, 수학, 영어 3과목의 점수를 각각 입력하세요 : ");
		
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int eng = sc.nextInt();
		
		int total = av.sum(kor, math, eng);
		double avg = av.avg(total);
		System.out.println("3과목 총점: " + total + "점이고, 평균은 " + avg + "점입니다.");
		
	}
}
