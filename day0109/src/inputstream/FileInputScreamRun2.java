package inputstream;

import java.io.FileInputStream;

public class FileInputScreamRun2 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			byte[] bArray = new byte[10];
			int i;
			
			while ((i = fis.read(bArray)) != -1) {
				for (byte b : bArray) {
					System.out.print((char)b);
				}
				System.out.println(" : " + i + "바이트 읽음");
			}
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		System.out.println("프로그램 종료");
	}

}
