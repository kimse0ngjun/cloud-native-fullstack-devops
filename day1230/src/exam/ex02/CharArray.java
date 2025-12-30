package exam.ex02;

public class CharArray {
	public static void main(String[] args) {
		char[] alphabets1 = new char[26];
		char ch = 'A';
		
		for (int i = 0; i < alphabets1.length; i++, ch++) {
			alphabets1[i] = ch;
		}
		
		for (int i = 0; i < alphabets1.length; i++) {
			// alphabet[i] = (char)(alphabets1[i]+32);
			System.out.println(alphabets1[i] + ", " + (char)(alphabets1[i]+32));
		}
		
	}
}
