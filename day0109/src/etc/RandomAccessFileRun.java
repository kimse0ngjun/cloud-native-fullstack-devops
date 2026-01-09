package etc;

import java.io.RandomAccessFile;

public class RandomAccessFileRun {

	public static void main(String[] args) {

		
		RandomAccessFile rf = null;
		
		try {
			rf = new RandomAccessFile("random.txt", "rw"); // 파일 이름, 모드(읽기(read),쓰기(write),추가(append) 등)
			rf.writeInt(100); // int = 4byte -> 파일 포인터 위치 = 4
			System.out.println("파일포인터 위치 : " + rf.getFilePointer());
			rf.writeDouble(3.14); // double = 8byte -> 파일 포인터 위치 = 4 + 8 = 12
			System.out.println("파일포인터 위치 : " + rf.getFilePointer());
			rf.writeUTF("안녕하세요"); // 수정된 UTF-8 사용 한글 (3byte) + null 문자 (2byte) = 4 + 8 + 17 = 29
			System.out.println("파일포인터 위치 : " + rf.getFilePointer());
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
