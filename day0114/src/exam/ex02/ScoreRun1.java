package exam.ex02;

import java.util.Scanner;

public class ScoreRun1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		while (true) {
		    System.out.print("정수를 입력하세요(종료: q): ");
		    String input = sc.nextLine();
		    
		    if (input.equalsIgnoreCase("q")) { 
		        System.out.println("프로그램 종료");
		        break;
		    }

		    try {
		        int num = Integer.parseInt(input);
		        sum += num;
		        System.out.println("현재까지 합계: " + sum);
		    } catch (NumberFormatException e) {
		        System.out.println("정수를 입력하거나 종료(q)를 입력하세요.");
		        continue;
		    }

		    if (sum >= 500) {
		        System.out.println("500 이상 도달! 최종 합계: " + sum);
		        break;
		    }
		}

		sc.close();

	}
}
