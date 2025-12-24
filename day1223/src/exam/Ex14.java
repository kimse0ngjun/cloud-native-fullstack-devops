package exam;

public class Ex14 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i < 10; i++) {
//			sum = sum + i++;
//			System.out.println(i);
			if (i%2==1) {
				sum = sum + i;
				System.out.println(i);
			}
		}
		System.out.print("1부터 10까지의 홀수의 합은 " + sum + "입니다.");
	}
}
