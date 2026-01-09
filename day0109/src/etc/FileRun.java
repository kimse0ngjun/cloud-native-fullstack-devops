package etc;

import java.io.File;

public class FileRun {

	public static void main(String[] args) {

		
		try {
			File file = new File("C:\\Temp\\newFile.txt"); // 로컬경로 : C:/Temp 	웹경로 : C:\\Temp 
			file.createNewFile();
			
			System.out.println(file.isFile());
			System.out.println(file.isDirectory());
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getPath());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			
			file.delete();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
