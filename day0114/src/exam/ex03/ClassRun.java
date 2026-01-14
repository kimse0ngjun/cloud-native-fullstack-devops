package exam.ex03;

import java.util.Scanner;

public class ClassRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Subject c = new Subject();
		boolean run = true;
		System.out.print("국어, 영어, 수학 점수를 차례대로 입력하세요 : ");
		
		int kor = Integer.parseInt(sc.nextLine());
		int math = Integer.parseInt(sc.nextLine());
		int eng = Integer.parseInt(sc.nextLine());
		
		while (run) {
			System.out.print("메뉴를 선택하세요 (1=총점, 2=평균, 3=종료) : ");
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1:
				int sum1 = c.sum(kor, math, eng);
				System.out.println("국어, 영어, 수학 점수의 총점은 : " + sum1 + "점입니다.");
				break;
			case 2:
				double avg1 = c.avg(kor, math, eng);
				System.out.println("국어, 영어, 수학 점수의 평균은 : " + avg1 + "점입니다.");
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴에 있는 번호 중에서 선택해주세요.");
				break;
			}
		}
	}
}
