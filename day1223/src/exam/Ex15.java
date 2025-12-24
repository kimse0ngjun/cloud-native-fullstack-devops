package exam;

public class Ex15 {
	public static void main(String[] args) {
		
		int sum = 1;
		
		for (int i = 1; i < 10; i++) {
			sum *= i++;
			System.out.println(sum);
		}
		System.out.println("1부터 10까지 짝수의 곱은 " + sum + "입니다.");
	}
}
