package stream;

import java.util.Arrays;

public class IntArrayRun {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int sum = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count(); // int 형태로 캐스팅
		
		System.out.println("sum = " + sum); 
		System.out.println("count = " + count);
	}
}
