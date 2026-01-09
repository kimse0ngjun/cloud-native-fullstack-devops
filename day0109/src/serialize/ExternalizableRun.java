package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableRun {

	public static void main(String[] args) {

		Dog myDog = new Dog();
		myDog.name = "바둑이";
		
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("external.out");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(myDog);
			
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
			fis = new FileInputStream("external.out");
			ois = new ObjectInputStream(fis);
			
			Dog dog = (Dog)ois.readObject();
			
			System.out.println("dog = " + dog);
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
