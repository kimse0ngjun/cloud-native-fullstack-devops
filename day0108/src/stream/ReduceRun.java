package stream;

import java.util.Arrays;

public class ReduceRun {

	public static void main(String[] args) {
		
		String[] greeting = {"안녕하세요~~", "hello", "Good morning", "반갑습니다^.^"};
		String str = Arrays.stream(greeting).reduce(new CompareString()).get();
		System.out.println(str);
		
	}

}
