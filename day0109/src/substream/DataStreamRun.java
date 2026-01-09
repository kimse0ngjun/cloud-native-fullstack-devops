package substream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamRun {

	public static void main(String[] args) {
		// 출력
		FileOutputStream fos = null;
		DataOutputStream dos = null; 
		
		try {
			fos = new FileOutputStream("data.txt");
			dos = new DataOutputStream(fos);
			
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				fos.close();
				System.out.println("출력이 완료되었습니다.");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		// 입력
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("data.txt");
			dis = new DataInputStream(fis);
			
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				System.out.println("입력이 종료되었습니다.");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
