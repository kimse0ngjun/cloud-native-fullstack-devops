package exam.ex03;

import java.util.Scanner;

public class CircleRun {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		
		double r = sc.nextDouble();
		double circleF = circle.circumference(r);
		double circleE = circle.extent(r);
		
		System.out.println("원의 둘레는 " + circleF + "이고 면적은 " + circleE + "입니다.");
	}
}
