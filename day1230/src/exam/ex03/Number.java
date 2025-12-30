package exam.ex03;

public class Number {
	public static void main(String[] args) {
		
		
//		int[] num1 = new int[5];
//		int sum = 0;
//		for (int i = 0; i < num1.length; i++) {
//			sum += i*2;
//		}
//		System.out.println(sum);
		
		int[] num2 = new int[] {2,4,6,8,10};
		int sum = 0;
		
		for (int i = 0; i < num2.length; i++) {
			sum += num2[i];
			System.out.println(num2[i]);
		}
		System.out.println(sum);
	}
}
