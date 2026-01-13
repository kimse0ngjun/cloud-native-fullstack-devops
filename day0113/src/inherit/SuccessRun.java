package inherit;

import java.util.Scanner;

public class SuccessRun {

	public static void main(String[] args) {
		
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
//		Success s = new Pass();
		Pass s1 = new Pass();
		System.out.println("데이터베이스, 디지털논리회로, 프로그래밍 3과목의 성적을 입력하세요 : ");
		
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		
		int sum = s1.sum(a, b, c);
		
		double avg = s1.avg(sum);
		s1.menu();
		
		int num = Integer.parseInt(sc.nextLine());
		
		switch (num) {
		case 1: System.out.println("총점 : " + sum);
			break;
		case 2: System.out.println("평균 : " + avg);
			break;
		case 3: s1.result(a, b, c, avg);
			break;
		default:
			System.out.println("메뉴의 번호만 사용 가능");
			break;
		}
		
//		while (run) {
//			System.out.println("=== 메뉴 ===");
//			System.out.println("(1) 총점계산 (2) 평균계산 (3) 합격여부 (4) 종료");
//			int num = Integer.parseInt(sc.nextLine());
//			
//			switch (num) {
//			case 1: 
//				int sum = s1.sum(a, b, c);
//				System.out.println("총점 : " + sum);
//				break;
//			case 2:
//				double avg1 = s1.avg(sum);
//				System.out.println("평균 : " + avg1);
//				break;
//			case 3:
//				s1.result(a, b, c, s1.avg(sum));
//				break;
//			case 4:
//				System.out.println("프로그램을 종료합니다.");
//				run = false;
//				break;
//			}
//		}
	}

}
