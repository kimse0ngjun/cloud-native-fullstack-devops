package cloud;

public class Fifth {
	public static void main(String ar[]) {
// --- 되는 예 ---
//		int _num;
//		int $num;
//		int _Num;
// --- 안되는 예 ---
//		int 0num; 
//		int public;
		// 변수 3개를 더해서 100이 출력되도록 하세요.
		// 1.
		int num1;
		int num2;
		int num3;
		int result;
		num1 = 20;
		num2 = 40;
		num3 = 40;
		result = num1 + num2 + num3;
		
		System.out.println("result = " + result);
		
		// 2.
		int num01 = 30;
		int num02 = 35;
		int num03 = 35;
		int result1;
		result1 = num01 + num02 + num03;
		
		System.out.println("result1 = " + result1);
	}
}
