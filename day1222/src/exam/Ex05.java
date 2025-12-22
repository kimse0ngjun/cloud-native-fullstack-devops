package exam;

import java.util.Scanner;

public class Ex05 {
	public static void main(String args[]) {
		/*
		 * 
			문제5. 본봉과 보너스를 각각 입력받아 세금이 총 금액의 10%일때 실제 수입과 연봉을 출력하는 자바프로그램을 작성하시오.
			- 출력예 -
			본봉(단위:만원)을 입력하세요 : 200
			보너스(단위:만원)를 입력하세요 : 20
			총수입은 198.0만원이고 연봉은 2376.0만원입니다.
		 */
		System.out.print("본봉(단위:만원)을 입력하세요 : ");
		Scanner sc1 = new Scanner(System.in);
		int salary = Integer.parseInt(sc1.nextLine());
		System.out.print("보너스(단위:만원)를 입력하세요 : ");
		Scanner sc2 = new Scanner(System.in);
		int bonus = Integer.parseInt(sc2.nextLine());
		// String bonus = sc.nextLine();
		
		float sum = (float) ((salary + bonus) * 0.9);
		float sum1 = (float) ((salary + bonus) * 0.9 * 12);
		
		String str = String.format("%.1f", sum); // 소수점 첫째 자리까지만 표현
		String str1 = String.format("%.1f", sum1);
		System.out.println("총수입은 " + str + "만원이고 연봉은 " + str1 + "만원입니다." );
	}
}
