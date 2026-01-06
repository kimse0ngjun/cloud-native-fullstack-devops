package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRun {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java"); // 0
		list.add("JDBC"); // 1
		list.add("HTML"); // 2
		
		int size = list.size(); // list의 크기보기
		System.out.println("size = " + size);
//		System.out.println(list);
		
		String watch = list.get(1); // get 메서드 출력
		System.out.println("watch = " + watch);
		
		for (int i = 0; i < list.size(); i++) {
			String strList = list.get(i);
			System.out.println(i + " : " + strList);
		}
		
		list.remove(2); // index 2 없애기
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String strList = list.get(i);
			System.out.println(i + " : " + strList);
		}
	}
}
