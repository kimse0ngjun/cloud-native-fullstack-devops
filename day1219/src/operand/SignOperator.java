package operand;

public class SignOperator {
	public static void main(String arg[]) {
		
		int x=-100;
		int result1=+x;
		int result2=-x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		byte b=100;
//		byte result3=-b; // 컴파일 에러 연산하면 정수로 변환된다.
	}
}
