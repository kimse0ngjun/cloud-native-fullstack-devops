package exam;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class P592Ex3 {

	public static void main(String[] args) {
		
		
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		
		try {
			fos = new FileOutputStream("a03.txt");
			osw = new OutputStreamWriter(fos);
			osw.write("지금까지 자바 정말 재밌게 공부했어요^^");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				osw.close();
				fos.close();
				System.out.println("a.txt에 출력했습니다.");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		

	}

}
