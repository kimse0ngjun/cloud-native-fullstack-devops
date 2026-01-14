package inputstream;

import java.io.IOException;

public class SystemInRun {

	public static void main(String[] args) throws IOException { // 예외처리 방법 1

		try {
			System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int i;
		
		i=System.in.read(); // read() 메서드로 한 바이트 읽음
		System.in.read(); // 13
		System.in.read(); // 10 
		// System.in.read(); 2번까지 입력 -> 이전의 값을 처리를 못해서 잘못된 값이 나올 수 있음
		System.out.println("i= " + i);
		System.out.println("(char)i= " + (char)i);
	}

}
