package cloud;

public class BasicLoop1 {

	public static void main(String[] args) {
		
		// 1 부터 10까지 더하는 코드
		int i, sum;
		
		for (i = 0, sum = 0; i < 10; i++) {
			sum = sum + i; // 45
//			sum = sum + i++; // 20 -> i 루프가 한번 더 켜짐 i = 0,2,4,6,8 실행
//			sum = sum + i+1; // 55
			System.out.print(", " + sum);
		}
		System.out.println();
		System.out.println("1~10까지의 합은 " + sum + "입니다."); 
	}
}
