package exam.ex04;

import java.util.Scanner;

public class CircleVolumeRun {
	/*
	 문제4. 문제3에서 부피를 계산하는 기능을 상속을 이용하여 자식클래스를 출력하는 자바프로그램을 작성하시오. 단, 구의 부피는 (4/3)*π*r^3임.
	 */
	public static void main(String[] args) {
		
		CircleVolume circle = new CircleVolume();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		
		double r = sc.nextDouble();
		double circleF = circle.circumference(r);
		double circleE = circle.extent(r);
		double circleV = circle.circleSphere(r);
		
		System.out.println("원의 둘레는 " + circleF + "이고 면적은 " + circleE + "입니다.");
		System.out.println("구의 반지름은 " + r + "이며 부피는 " + circleV + "입니다.");
	}
}
