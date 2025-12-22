package exam;

import java.util.Scanner;

public class Ex10 {
	public static void main(String args[]) {
		System.out.print("몸무게를 입력하시오 :");
		Scanner sc = new Scanner(System.in);
		int weight = Integer.parseInt(sc.nextLine());
		
		double weight1 = (double) weight * 0.17;
		System.out.println("달에서의 몸무게는 " + weight1 + "kg입니다.");
		
	}
}
