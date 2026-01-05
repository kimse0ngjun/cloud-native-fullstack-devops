package exam.ex03;

import java.util.Scanner;

public class CircleExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CircleRadius ct = new CircleRadius();
		// CircleTest ct = new CircleRadius(); // 자동 형변환
		System.out.println("원의 반지름을 입력하세요 : ");
		
		int r = Integer.parseInt(sc.nextLine());
		
		System.out.println("원의 둘레는 " + ct.circumstance(r) + "이며 원의 면적은 " + ct.area(r) + "입니다.");
		
		// double area = ct.area(r);
	}

}
