package exam;

public class Ex01 {
	public static void main(String arg[]) {
		
		int a = 16;
		
		// 1
		if (!(a <= 20) && !(a >= 10)) {
			System.out.print("10~20 사이값이 아닙니다.");
		} else {
			System.out.print("10~20 사이값이 맞습니다.");
		}
		System.out.println();
		// 2
		if (a < 0) {
			System.out.print("음수입니다.");
		} else if (a > 0) {
			System.out.print("양수입니다.");
		} else {
			System.out.print("0입니다.");
		}
		System.out.println();
		// 3
		if (a - 100 < 0) {
			System.out.print("음수가 되지 않습니다.");
		} else {
			System.out.print("음수입니다.");
		}
		System.out.println();
		// 4
		if (a % 4 != 0) {
			System.out.print("4로 나누어 떨어지지 않는다.");
		} else {
			System.out.print("4로 나누어진다.");
		}
	}
}
