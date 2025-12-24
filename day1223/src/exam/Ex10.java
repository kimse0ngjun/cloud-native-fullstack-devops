package exam;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		/*
		 문제10. switch문을 사용하여 아래 출력예와 같이 자바프로그램을 작성하여 보시오. 단, 합격여부는 3과목 중 한 과목이라도 40점 미만이거나 평균점수가 60점 미만이면 불합격으로 출력하며 그 외에는 합격으로 출력하시오.
		- 출력예 -
		전기, 전자, 프로그래밍 3과목의 성적을 입력하세요 : 90 100 30
		=== 메뉴 ===
		(1) 총점계산 (2) 평균계산 (3) 합격여부 (4) 종료
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("전기, 전자, 프로그래밍 3과목의 성적을 입력하세요 :");
		int elect = Integer.parseInt(sc.nextLine());
		int electric = Integer.parseInt(sc.nextLine());
		int programing = Integer.parseInt(sc.nextLine());
		
		System.out.println("=== 메뉴 ===");
		System.out.println("(1) 총점계산 (2) 평균계산 (3) 합격여부 (4) 종료");
		
		int result = Integer.parseInt(sc.nextLine());
		int total = elect+electric+programing;
		double avg = (double) total/3;
		
		switch (result) {
		case 1: System.out.print("총점은 " + total + "입니다.");
			break;
		case 2: System.out.print("평균은 " + avg + "입니다.");
			break;
		case 3: 
			if (avg < 60 || elect < 40 || electric < 40 || programing < 40) {
				System.out.print("불합격");
			} else {
				System.out.print("합격");
			}
			break;
		case 4: 
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			break;
		default:
			System.out.println("1~3 중에서 입력하세요.");
		}
	}
}
