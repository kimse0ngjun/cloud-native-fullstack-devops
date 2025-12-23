package input;

import java.util.Scanner;

public class Keyboard3 {
	public static void main(String ar[]) {
		
		// 자신의 생년, 월, 일을 순서대로 입력받아 출력하는 자바 프로그램을 작성하세요.
		/*
		 * 출력예
		 * 생년월일을 차례대로 입력하세요 : 1980 10 30
		 * 입력하신 생년월일은 1980년 10월 30일생입니다.
		 */	
		// 1
		System.out.print("생년월일을 차례대로 입력하세요 : ");
		Scanner sc1 = new Scanner(System.in);
//		int year = Integer.parseInt(sc1.nextLine());
//		
//		Scanner sc2 = new Scanner(System.in);
//		int month = Integer.parseInt(sc2.nextLine());
//		
//		Scanner sc3 = new Scanner(System.in);
//		int day = Integer.parseInt(sc3.nextLine());
//		System.out.println("입력하신 생년월일은 " + year + "년 " + month + "월 " + day + "일생입니다.");
		
		// 2
		int year = sc1.nextInt();
		int month = sc1.nextInt();
		int day = sc1.nextInt();		
		System.out.println("입력하신 생년월일은 " + year + "년 " + month + "월 " + day + "일생입니다.");
		
		// 3
//		String year = sc1.nextLine(); // API 문서로 확인가능
//		String month = sc1.nextLine();
//		String day = sc1.nextLine();
	}
}
