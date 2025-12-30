package exam.ex07;

public class ArrayRun {
	// 정수 10개 배열로 만들고 sum 변수를 이용해 합을 구하시오.
	public static void main(String[] args) {
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		} 
		System.out.println("sum = " + sum);
	}
}
