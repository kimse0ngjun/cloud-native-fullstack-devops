package exam;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * 문제1. 아래와 같이 출력하는 자바프로그램을 작성하시오.
			- 출력예 -
			키(cm)를 입력하세요 : 180 
			몸무게(kg)를 입력하세요 : 75
			입력하신 키는 180cm이고 몸무게는 75kg입니다.
		 */
		System.out.print("키(cm)를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int height = Integer.parseInt(sc.nextLine());
		System.out.print("몸무게(kg)를 입력하세요 : ");
		Scanner sc2 = new Scanner(System.in);
		int weight = Integer.parseInt(sc2.nextLine());
		System.out.println("입력하신 키는 " + height + "cm이고 몸무게는 " + weight + "kg입니다." );
	}
}
