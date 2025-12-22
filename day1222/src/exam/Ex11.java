package exam;

import java.util.Scanner;

public class Ex11 {
	public static void main() {
		System.out.println("키(cm)를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int height = Integer.parseInt(sc.nextLine());
		
		double inch = (double) height / 2.54;
		
		System.out.println("키 " + height + "센티미터를 인치로 변환하면 " + inch + "인치입니다.");
	}
}
