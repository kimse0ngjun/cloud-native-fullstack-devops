package cloud;

public class BooleanVariable {
	public static void main(String arg[]) {
		
		int num1 = 10;
		int num2 = 20;
		// >, <, = 비교 연산자는 왼쪽이 기준
		boolean bool = num1 > num2; 
		boolean bool2 = num1 < num2;
		System.out.println("bool = " + bool);
		System.out.println("bool2 = " + bool2);
	}
}
