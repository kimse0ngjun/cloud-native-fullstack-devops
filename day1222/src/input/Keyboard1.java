package input;

import java.util.Scanner;

public class Keyboard1 {
	public static void main(String ar[]) throws Exception {
		
		// int num = System.in.read(); // throws(정적처리), try ~ catch(동적처리)
		
		System.out.print("키보드로 값을 입력하세요 : ");
		Scanner sc = new Scanner(System.in); // 입력되는 값은 문자(String)
		String keyBoard = sc.nextLine(); 
		int number = Integer.parseInt(keyBoard); // wrapper 클래스로 활용해서 타입변환
		System.out.println("KeyBoard = " + (keyBoard + 10));
		System.out.println("number = " + (number + 10));
	}
}
