package exam;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args){
		/*
		 문제4. 정수값을 입력했을때 홀수, 짝수를 판별하는 자바프로그램을 작성하시오.
		- 출력예 -
		정수값을 입력하세요 : 20(15)
		입력하신 숫자는 20(15)이며 짝수(홀수)입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.print("입력하신 숫자는 " + num + "이며 짝수입니다.");
		} else if (num % 2 != 0) {
			System.out.print("입력하신 숫자는 " + num + "이며 홀수입니다.");
		} else {
			System.out.print("0입니다.");
		}
	}
}
