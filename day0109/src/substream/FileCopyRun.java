package substream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyRun {

	public static void main(String[] args) {

		long mileSec = 0;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("a.zip");
			fos = new FileOutputStream("copy.zip");
			
			mileSec = System.currentTimeMillis();
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
			
			mileSec = System.currentTimeMillis() - mileSec;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("파일을 복사하는데 " + mileSec + "밀리초가 소요되었습니다.");
	}

}
