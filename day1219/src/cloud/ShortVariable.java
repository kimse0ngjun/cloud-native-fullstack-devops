package cloud;

public class ShortVariable {
	public static void main(String arg[]) {
		short num1 = 10;
		short num2 = 10;
		short result = (short) (num1 + num2); // 사칙연산 -> int형으로 변하게 됨
//		int result = num1 + num2;
		num1+=1; // num1 = num1+1, 배정연산은 기존의 타입을 그대로 유지
		
		System.out.println("result = " + result);
	}
}
