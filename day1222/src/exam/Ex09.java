package exam;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		/*
		 * 문제9. 섭씨온도를 입력하면 화씨온도로 변환하여 출력하는 자바프로그램을 작성하시오.
			- 출력예 -
			섭씨온도를 입력하세요 : 23
			화씨온도로 변화하면 73.4 (F)입니다.
		 */
		System.out.print("섭씨온도를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int sub = Integer.parseInt(sc.nextLine());
		
	    float hwa = (float) (sub * 1.8 + 32);
		
		System.out.println("화씨온도로 변화하면 " + hwa + "(F)입니다.");
	}
}
