package exam.ex03;

public class StringRun {
	public static void main(String[] args) {
		
		byte[] byteArray = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		String str = new String(byteArray);
		System.out.println("str = " + str);
	}
}
