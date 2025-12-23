package exam;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		System.out.print("몸무게를 입력하시오 :");
		Scanner sc = new Scanner(System.in);
//		double weight1 = (double) weight * 0.17;
		String weight = sc.nextLine();
		double sum = Double.parseDouble(weight) * 0.17;
		System.out.println("달에서의 몸무게는 " + sum + "kg입니다.");
		
	}
}
