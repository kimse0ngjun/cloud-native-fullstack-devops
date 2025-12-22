package exam;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		/*
		 * 문제8. 전기요금을 계산하는 출력예와 같이 출력하는 자바프로그램을 작성하시오. 단, 기본요금은 1390원이고 kw당 요금은 164원으로 한다.
			- 출력예 -
			사용 kw를 입력하세요 : 100
			사용하신 전기요금은 17790원입니다.
		 */
		System.out.print("사용 kw를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		
		int kw = 164;
		int normalFee = 1390;
		int sum = normalFee + a * kw;
		System.out.println("사용하신 전기요금은 " + sum + "원입니다.");
	}
}
