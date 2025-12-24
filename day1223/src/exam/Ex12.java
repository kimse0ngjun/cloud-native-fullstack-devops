package exam;

public class Ex12 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 101; i++) {
			sum = sum + i;
			System.out.println(i);
		}
		System.out.print("합계: " + sum);
	}
}

