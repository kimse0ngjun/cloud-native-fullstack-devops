package exam;

public class Ex11 {
	public static void main(String[] args) {
		/*
		 문제11. for 반복문을 사용하여 1부터 10까지의 합계를 구하여 출력하는 자바프로그램을 작성하여 보시오.
		 */
		int sum = 0;
		
		for (int i = 1; i < 10; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
		System.out.print("합계: " + sum);
	}
}
