package exam.ex07;

import java.util.Scanner;

public class PassRun {
	public static void main(String[] args) {
		
		
		Pass pass = new Pass();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("데이터베이스, 디지털논리회로, 프로그래밍 3과목의 성적을 입력하세요 : ");
		int database = Integer.parseInt(sc.nextLine());
		int digital = Integer.parseInt(sc.nextLine());
		int program = Integer.parseInt(sc.nextLine());
		
		int sum = pass.sum(database, digital, program);
		double avg = pass.avg(database, digital, program);
		pass.menu();
		
		int num = Integer.parseInt(sc.nextLine());
		
		switch (num) {
		case 1:
			System.out.println("총점은 " + sum + "점입니다.");
			break;
		case 2:
			System.out.println("평균은 " + avg + "점입니다.");
			break;
		case 3:
			pass.result(database, digital, program, avg);
			break;
		default:
			System.out.println("1,2,3번 중에서 입력하세요.");
			break;
		}
	}
}
