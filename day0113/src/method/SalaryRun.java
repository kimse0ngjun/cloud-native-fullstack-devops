package method;

import java.util.Scanner;

public class SalaryRun {

	public static void main(String[] args) {
//
//		Salary s = new Salary();
//		int sum1 = s.sum(150, 60);
//		double stax = s.tax(210);
//		
//		
//		System.out.println("A회사원의 실 입금액은 " + (sum1-stax) + "만원입니다.");
		
		Scanner sc = new Scanner(System.in);
		Salary sal = new Salary();
		
		System.out.println("본봉과 보너를 차례대로 입력하세요 : ");
		
		int basic = Integer.parseInt(sc.nextLine());
		int bonus = Integer.parseInt(sc.nextLine());
		
		int sum = sal.sum(basic, bonus);
		double pay = sal.tax(sum);
		System.out.println("A회사원의 실 입금액은 " + pay + "만원입니다.");
	}

}
