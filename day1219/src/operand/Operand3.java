package operand;

public class Operand3 {
	public static void main(String arg[]) {
		
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		// AND (&&)
		result = (num1 < num2) && (num1 != num2);
		System.out.println("result = " + result);
		
		// OR (||)
		result = (num1 < num2) || (num1 != num2);
		System.out.println("result = " + result);
		
		// NOT 
		result = !((num1 < num2) && (num1 != num2));
		System.out.println("result = " + result);
	}
}
