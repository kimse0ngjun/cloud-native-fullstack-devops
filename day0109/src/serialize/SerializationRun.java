package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationRun {

	public static void main(String[] args) {

		Person ps1 = new Person("홍길동", "대표이사");
		Person ps2 = new Person("이순신", "상무이사");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("serial.out");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(ps1);
			oos.writeObject(ps2);
			
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		} finally {
			try {
				fos.close();
				System.out.println("출력을 종료합니다.");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		// 입력
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("serial.out");
			ois = new ObjectInputStream(fis);
			
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println("p1 = " + p1);
			System.out.println("p2 = " + p2);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				System.out.println("입력을 종료합니다.");
			} catch (Exception e2) {
				e2.printStackTrace();
				System.out.println("예외 발생 : " + e2.getMessage());
			} 
		}
		
	}

}
