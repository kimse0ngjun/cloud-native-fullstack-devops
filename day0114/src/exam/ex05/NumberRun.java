package exam.ex05;

import java.util.Random;
import java.util.Scanner;

public class NumberRun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int answer = (int) (Math.random()*100)+1;
		
		System.out.println("************************");
		System.out.println("*  숫자 맞추기 게임  *");
		System.out.println("************************");
		
		while (true) {
			System.out.print("1부터 100까지 사이의 숫자를 입력하세요 : ");
			int num = Integer.parseInt(sc.nextLine());
			if (num < answer) {
				System.out.println("입력한 정수는 " + num + "이며 정답보다 작은 수입니다.");
			} else if (num > answer) {
				System.out.println("입력한 정수는 " + num + "이며 정답보다 큰 수입니다.");
			} else if (num == answer) {
				System.out.println("축하합니다! 입력한 정수는 " + num + "이며 정답입니다.");
			} else {
				System.out.println("1부터 100까지의 숫자만 입력");
			}
		}

	}

}
