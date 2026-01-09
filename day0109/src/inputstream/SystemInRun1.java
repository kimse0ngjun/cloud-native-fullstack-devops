package inputstream;

public class SystemInRun1 {

	public static void main(String[] args) throws Exception {

		int i;
		
		System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르세요.");
		while ((i = System.in.read()) != '\n') { //
			System.out.println((char)i);
		}
	}

}
