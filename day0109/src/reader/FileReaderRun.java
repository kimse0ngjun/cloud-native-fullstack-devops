package reader;

import java.io.FileReader;

public class FileReaderRun {
 
	public static void main(String[] args) {
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("reader.txt");
			int i;
			
			while((i = fr.read()) != -1){
				System.out.println((char)i);
			}
			
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			System.out.println("=== [끝] ===");
		}
	}
}
