package cloud;

public class Forth {
	public static void main(String ar[]) {
		
		int bnum = 0B00000000000000000000000000000101; //00000000
		int bnum1 = 0B11111111111111111111111111111011; // 11111111 1, 2의 보수 적용
		int sum = bnum + bnum1;
		
		System.out.println("bnum = " + bnum + ", bnum1 = " + bnum1);
		System.out.println("sum = " + sum);
	}
}
