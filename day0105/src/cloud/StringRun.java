package cloud;

public class StringRun {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println("str1 = " + str1.toString() + ", str2 = " + str2.toString());
		
		if (str1 == str2) { // 객체비교
			System.out.println((str1 == str2) + ", 같다");	
		} else {
			System.out.println((str1 == str2) + ", 같지않다");
		}
		
		if (str1.equals(str2)) { // 문자열 값 비교
			System.out.println((str1.equals(str2)) + ", 같다");	
		} else {
			System.out.println((str1.equals(str2)) + ", 같지않다");
		}
	}	

}
