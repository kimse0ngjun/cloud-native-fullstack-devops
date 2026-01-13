package method;

import java.util.Scanner;

public class FeeRun {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Fee fee = new Fee();
		System.out.print("전기사용량을 입력하세요 : ");
		double fw = Double.parseDouble(sc.nextLine());
		
		double tax = (fee.ElecPay((int) fw)) * 0.05;
		
		System.out.println("사용하신 전기요금은 " + (fee.ElecPay((int) fw) + tax) + "원입니다.");
		
	}

}
