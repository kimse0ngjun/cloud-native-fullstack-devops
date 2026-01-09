package outputstream;

import java.io.FileOutputStream;

public class FileOutputStreamRun {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("output.txt", true); // 없으면 output.txt 파일을 만들어라, 파일 유지 및 append 기능
//		FileOutputStream fos = new FileOutputStream("output.txt"); // 파일 유지 x
		fos.write(65);
		fos.write(66); // 문자 생성 메서드 write
	}

}
