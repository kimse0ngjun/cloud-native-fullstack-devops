package cloud;

import java.util.Iterator;

public class BasicLoop2 {
	public static void main(String[] args) {
		
		// 1 ~ 10 사이의 홀수를 구하는 코드를 작성하세요. (for)
		
		// 1
//		int i, num;
//		
//		for (i = 0; i < 10; i++) {
//			num = 1+i++;
//			System.out.println(num);
//		}
		
		// 2
		int i, j, odd, odd1;
		
		for (i = 0; i < 10; i++) {
			odd = i++;
			System.out.print(" " + (odd+1));
		}
		System.out.println();
		
		// 3
		for (j = 0, odd1 = 0; j < 10; j++) {
			odd1 = j;
			if (j % 2 == 0) {
				continue; // 건너뛰기	
			}
			System.out.print(" " + odd1);
		}
	}
}
