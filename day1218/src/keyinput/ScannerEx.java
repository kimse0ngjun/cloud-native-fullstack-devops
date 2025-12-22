package keyinput;

import java.util.Scanner; // 생성자 메서드

public class ScannerEx {

	public static void main(String[] args) {
		// shift + ctrl + o 객체를 자동으로 호출하는 단축키
		Scanner sc = new Scanner(System.in); // 들어간 입력값들은 전부 "문자열"
		
		System.out.println("키보드에서 값을 입력하세요 : ");
		
		String keyboardInput=sc.nextLine();
		
		System.out.println("keyboardInput의 입력값: " + keyboardInput);
	}

}	