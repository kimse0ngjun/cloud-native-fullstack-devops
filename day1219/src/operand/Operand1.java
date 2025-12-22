package operand;

public class Operand1 {
	public static void main(String arg[]) {
		
		int num1 = 10;
		int num2 = 10;
		
		int result1 = ++num1; // 우선순위가 높음
		int result2 = num2++;
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
	}
}
