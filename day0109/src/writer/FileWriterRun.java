package writer;

import java.io.FileWriter;

public class FileWriterRun {
	
	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		
		try {
			fw = new FileWriter("writer.txt", true);
			
			fw.write('A');
			char buf[] = {'B', 'C', 'D', 'E', 'F'};
			
			fw.write(buf);
			fw.write("안녕하세요. 잘 써지네요.");
			fw.write(buf, 1, 2);
			fw.write("65");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				System.out.println("프로그램 종료");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
