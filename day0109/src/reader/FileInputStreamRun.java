package reader;

import java.io.FileInputStream;

public class FileInputStreamRun {

	public static void main(String[] args) {

		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("reader.txt");
			int i;
			
			while ((i = fis.read()) != -1) {
				System.out.println((char) i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				System.out.println("프로그램 종료");
			} catch (Exception e2) {
				e2.printStackTrace();
			} 
		}
	}

}
