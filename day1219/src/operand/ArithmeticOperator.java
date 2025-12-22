package operand;

public class ArithmeticOperator {
	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		int result;
		String result2;
		
		result = v1%v2; // 1
		result2 = (v1 % v2 == 1) ? "홀수" : "짝수";
		System.out.println("result = " + result);
		System.out.println("result2 = " + result2);
	}
}
