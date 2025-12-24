package exam;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		/*
		 문제9. switch문을 사용하여 사용자로부터 하나의 문자를 입력받아서 문자가 'R' 또는 'r'이면 사각형의 면적을 계산하고 'C' 또는 'c'이면 원의 면적을 'T' 또는 't'는 삼각형의 면적을 계산하여 출력하는 자바프로그램을 작성하여 보시오. 단, 원주율은 3.141592를 사용하며 상수 처리하시오.
		- 출력예 -
		사각형(R), 원(C), 삼각형(T) 중 하나를 선택하세요 : T(C/R)
		밑변의 길이(반지름/가로 길이)를 입력하세요 : 10 
		높이(세로 길이)를 입력하세요 : 10
		구하고자 하는 삼각형(원/사각형)의 면적은 50.00(314.16/100)입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int result = 0;		
			
			System.out.println("사각형(R), 원(C), 삼각형(T) 중 하나를 선택하세요 : ");
			String choice = sc.nextLine();
			
			System.out.println("밑변의 길이(반지름/가로 길이)를 입력하세요 : ");
			int raw = sc.nextInt();
			
			System.out.println("이(세로 길이)를 입력하세요 : ");
			int column = sc.nextInt();
			
			switch (choice) {
			
			case "R" , "r":
				result = raw * column;
				System.out.println("구하고자 하는 사각형의 면적은 " + result + "입니다.");
				break;
			case "C" , "c":
				result = raw * column;
				System.out.println("구하고자 하는 원의 면적은 " + result*3.1416 + "입니다.");
				break;
			case "T" , "t":
				result = raw * column;
				System.out.println("구하고자 하는 삼각형의 면적은 " + result/2 + "입니다.");
				break;
			default:
				System.out.println("R,C,T 중에서 문자 입력 해주세요.");
				break;
				
//		final double PI=3.141592; 
//		System.out.println("사각형(R), 원(C), 삼각형(T) 중 하나를 선택하세요 : ");
//		int diagram = System.in.read(); // read()는 1바이트 값만 숫자로 반환한다. 키보드 숫자 0은 48이다. 아스키코드
//		char ch = (char) diagram;
//		System.out.print("ch=" + ch);
// 		int n1, n2;
//		switch (ch) {
//		case 'R', 'r':
//			System.out.print("밑변")
//			n1 = Integer.parseInt(sc.nextLine());
//			System.out.print("높이")
//			n2 = Integer.parseInt(sc.nextLine());
//			System.out.println("사격형면적: ");
//			break;
//		
//				
//				
//				
		}
	}
}
