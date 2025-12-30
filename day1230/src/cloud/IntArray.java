package cloud;

public class IntArray {
	public static void main(String[] args) {
		
		// 1. 키보드 값 입력 받을 때
		int[] num1 = new int[10]; // 객체
		
		// 2. 값을 지정 받았을 때
		int[] num2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int[] num2 = new int[10] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 이렇게 만들면 안됨(중복)
		
		// 3. 2번이랑 비슷함
		int[] num3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		
		System.out.println("num2[4] = " + num2[0]); //index 0이 첫번째
		
		for (int i = 0; i < num1.length; i++) {
			System.out.print(", " + num1[i]); // , 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
		}
		
		System.out.println();
		System.out.println("num2.length = " + num2.length); // 길이을 만들어줌
		
		for (int i = 0; i < num3.length; i++) {
			sum += num3[i];
		}
		System.out.print("sum = " + sum);
	}
}
