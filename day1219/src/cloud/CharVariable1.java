package cloud;

public class CharVariable1 {
	public static void main(String arg[]) {
		// 아스키코드, 유니코드는 정수형과 문자형이 호환됨.
		char ch1 = 'A'; // 65, char = 2byte
		System.out.println("ch1 = " + ch1);
		System.out.println("(int) ch1 = " + (int)ch1);
		
		int ch2 = 97; // a
		System.out.println("ch2 = " + ch2);
		System.out.println("(char) ch2 = " + (char)ch2);
		
		char ch3 = '한';
		char ch4 = '\uD55C'; // 한
		System.out.println("ch3 = " + ch3);
		System.out.println("ch4 = " + ch4);
		
		char ch5 = 65;
		char ch6 = (char)-65; // 문자형은 음수값을 쓸 수 없다.
		System.out.println("ch5 = " + ch5);
		System.out.println("ch6 = " + ch6);
	}
}
