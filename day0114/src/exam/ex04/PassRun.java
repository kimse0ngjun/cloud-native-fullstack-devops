package exam.ex04;

import java.util.Scanner;

public class PassRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pass pass = new Pass();
		SuccessPass sp = new SuccessPass();
		
	    boolean run = true;
		System.out.print("전기, 전자, 프로그래밍 3과목의 성적을 입력하세요 : ");
		int elect = Integer.parseInt(sc.nextLine());
		int electro = Integer.parseInt(sc.nextLine());
		int pro = Integer.parseInt(sc.nextLine());
		
		while (run) {
			System.out.println("=== 메뉴 ===");
			System.out.println("(1) 총점계산 (2) 평균계산 (3) 합격여부 (4) 종료 ");
			System.out.print("선택 :");
			int num = Integer.parseInt(sc.nextLine());
			
			switch (num) {
			case 1:
				int sum1 = pass.sum(elect, electro, pro);
				System.out.println("총점 : " + sum1);
				break;
			case 2:
				double avg1 = pass.avg(elect, electro, pro);
				System.out.println("평균 : " + avg1);
				break;
			case 3:
				sp.sPass(elect, electro, pro);
				break;
			case 4:
				System.out.println("프로그램 종료");
				run = false;
			}
		}
		
	}
}
