package exam;

import java.util.Scanner;

public class Ex12 {
	public static void main(String args[]) {
		System.out.print("이름을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.print("몸무게를 입력하세요 (kg) : ");
		Scanner sc1 = new Scanner(System.in);
		int weight = Integer.parseInt(sc1.nextLine());
		
		System.out.print("키를 입력하세요 (m) : ");
		Scanner sc2 = new Scanner(System.in);
		double height = Double.parseDouble(sc2.nextLine());
		
		
		double result = (double) (weight/(height * height));
		String str = String.format("%.1f", result);
		System.out.println(name + "님의 bmi는 " + str + "입니다");
		
	}
}
