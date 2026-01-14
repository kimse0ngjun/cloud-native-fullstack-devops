package stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteRun {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("C:\\Temp\\test1.db");
		
		byte[] array = {10, 20, 30};
		
		os.write(array);
		os.flush(); // 출력, [버퍼에 있는 모든 바이트를 출력, 클리어 한다.]
		os.close();
		
		System.out.println("출력을 종료합니다.");
	}

}
