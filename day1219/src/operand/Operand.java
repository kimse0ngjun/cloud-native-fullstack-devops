package operand;

public class Operand {
	public static void main(String arg[]) {
		
		int num1 = 10;
//		num1 = -num1;
		num1++; // 1 증가, 단항 연산
		int num2 = 10;
		int sum = num1 + num2;	// 이항 연산
//		num1++; // 1 증가 
		char ch;
		ch = (num1 == num2) ? 'A' : 'B'; // 삼항 연산자 (조건이 참이면 'A', 거짓이면 'B') 
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("sum = " + sum);
		System.out.println("ch = " + ch);
		System.out.println(-num1);
	} 
}
