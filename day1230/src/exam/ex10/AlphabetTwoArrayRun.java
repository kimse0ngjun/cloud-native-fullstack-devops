package exam.ex10;

public class AlphabetTwoArrayRun {
	public static void main(String[] args) {
//		char[][] alphabet = new char[2][2];
//		char ch = 'a';
//		
//		for (int i = 0; i < alphabet.length; i++) {
//			for (int j = 0; j < alphabet[i].length; j++) {
//				alphabet[i][j] = ch;
//				ch++;
//				System.out.println(alphabet[i][j]);
//				System.out.println(alphabet.length);
		
		char[][] alphabet = new char[13][2]; // 행, 열
		char ch = 'a';
		
		for (int i = 0; i < alphabet.length; i++) {
			for (int j= 0; j < alphabet[i].length; j++) {
				alphabet[i][j] = ch;
				System.out.print(alphabet[i][j] + " ");
				ch++;
			}
			System.out.println();
		}
	}
}
