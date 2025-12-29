package exam;

import java.util.Scanner;

public class Ex07 {
	/*
	 문제7. 아래 출력예와 같이 숫자 맞추기 게임 자바프로그램을 작성하시오. 단, 1~100까지의 난수를 사용하되 난수는 출력하지 않고 메시지만 보고 무한반복시켜 정답을 맞추시오.
	- 출력예 -
	***********************
	*  숫자 맞추기 게임  *
	***********************
	1부터 100까지 사이의 숫자를 입력하세요 : 50
	입력한 정수는 50이며 정답보다 작은 수입니다. 
	1부터 100까지 사이의 숫자를 입력하세요 : 80
	입력한 정수는 80이며 정답보다 큰 수입니다.
	1부터 100까지 사이의 숫자를 입력하세요 : 70
	
	축하합니다! 입력한 정수는 70이며 정답입니다!
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int answer = (int) (Math.random()*100)+1;
		System.out.println("***********************");
		System.out.println("*  숫자 맞추기 게임  *");
		System.out.println("***********************");
		
		while (true) {
			System.out.print("1부터 100까지 사이의 숫자를 입력하세요 :");
			int num = Integer.parseInt(sc.nextLine());
			
			if (num < answer) {
				System.out.println("입력한 정수는 " + num + "이며 정답보다 작은 수입니다.");
			} else if (num > answer) {
				System.out.println("입력한 정수는 " + num + "이며 정답보다 큰 수입니다.");
			} else if (num == answer) {
				System.out.println("축하합니다! 입력한 정수는 " + num + "이며 정답입니다!");
				break;
			} else {
				System.out.println("1부터 100사이는 숫자만 입력하세요.");
			}
		}
	}

}
