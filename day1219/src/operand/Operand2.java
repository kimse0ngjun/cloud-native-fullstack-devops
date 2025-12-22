package operand;

public class Operand2 {
	public static void main(String arg[]) {
		int num1 = 10;
		int num2 = 20;
		boolean result;
		result = num1 > num2; // 크다
		System.out.println("result = " + result);
		
		result = num1 < num2; // 작다
		System.out.println("result = " + result);
		
		result = num1 >= num2; // 크거나 같다
		System.out.println("result = " + result);
		
		result = num1 <= num2; // 작거나 같다
		System.out.println("result = " + result);
		
		result = num1 == num2; // 같다
		System.out.println("result = " + result);
		
		result = num1 != num2; // 같지 않다
		System.out.println("result = " + result);
	}
}
