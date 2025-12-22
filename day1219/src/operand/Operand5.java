package operand;

public class Operand5 {
	public static void main(String arg[]) {
		int num1 = 0b00001111;
		int num2 = 0b00001010;
		int result = ~num1; // 11110000
		System.out.println("result = " + result); // -16
		result=num1&num2;
		System.out.println("result = " + result); // 00001010 - 10
		result=num1|num2;
		System.out.println("result = " + result); // 00001111 - 15
		result=num1^num2; // XOR - 베타적 논리합 -> 서로 값이 다를때 // 00000101 - 5
		System.out.println("result = " + result);
	}
}
