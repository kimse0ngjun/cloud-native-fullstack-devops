package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStringRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> sList = new ArrayList<String>();
		
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		// 1.
		Stream<String> stream = sList.stream();
		stream.forEach(s-> System.out.println(s + " ")); // lambda
		System.out.println("============ [end] =============");
		
		sList.stream().sorted().forEach(s -> System.out.print(s + " ")); // sorted() -> 오름차순 정렬
		System.out.println("============ [end] =============");
		sList.stream().map(s -> s.length()).forEach(n-> System.out.println(n));
		sList.stream().map(s -> s.length() >= 5).forEach(s-> System.out.println(s));
		
		
		
		// 2.
//		for (String string : sList) {
//			System.out.println(string);
//		}
	}

}
