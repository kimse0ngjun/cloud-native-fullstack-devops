package outputstream;

import java.io.FileOutputStream;

public class FileOutputStreamRun1 {

	public static void main(String[] args) {

//		FileOutputStream fos = new FileOutputStream("output.txt");
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("output.txt");
			
			byte[] bArray = new byte[26];
			byte data = 65;
			for (int i = 0; i < bArray.length; i++) {
				bArray[i] = data;
				data++;
			}
			fos.write(bArray);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("출력을 완료했습니다.");
	}

}
