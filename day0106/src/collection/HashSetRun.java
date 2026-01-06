package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetRun {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>(); // 구현체 HashSet
		
		set.add("JAVA");
		set.add("JDBC");
//		set.add("HTML");
		set.add("HTML"); // set은 중복 허용 X
		
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		Iterator<String> iterator = set.iterator(); 
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			System.out.println(" " + element); // 출력 순서는 보장되지 않음
			
		}
		
		set.remove("HTML"); // 삭제
		set.remove("JDBC");
		System.out.println("총 객체수 : " + set.size());
		
		for (String element : set) {
			System.out.println(" " + element);
		}
		
		set.clear(); // 삭제
		System.out.println("총 객체수 : " + set.size());
		if (set.isEmpty()) {
			System.out.println("비어 있음!!");
		}
	} 

}
