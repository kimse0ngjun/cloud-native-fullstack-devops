package exam;

import java.io.IOException;

public class Ex18 {
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("영문 소문자를 입력하세요 : ");
//			String ch = sc.nextLine();
			// a = 97, A = 65
			int ch1 = System.in.read();
			int ch2 = ch1 - 32;
			char ch3 = (char) ch1;
			char ch4 = (char) ch2;
			
			System.in.read();
			System.in.read(); // Enter
			
			if (ch3 == 'q') {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.println("입력하신 문자는 " + ch3 + "이며 대문자로 변환하면 " + ch4 + "입니다.");
		}
	}
}
