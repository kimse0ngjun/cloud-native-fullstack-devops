package cloud;

import java.util.ArrayList;

public class BookArrayList {
	public static void main(String[] args) {
		
		ArrayList<Book> lib = new ArrayList<Book>();
		lib.add(new Book("태백산맥", "조정래"));
		lib.add(new Book("데미안", "헤르만 헤세"));
		lib.add(new Book("비전공자들도 이해할 수 있는 IT 전공 지식", "이해영"));
		lib.add(new Book("어린 왕자", "생텍쥐베리"));
		System.out.println("lib.size() = " + lib.size()); // List에 있는 개수를 보여줌
		
		// 1
		for (int i = 0; i < lib.size(); i++) {
			Book book = lib.get(i);
//			System.out.println("book = " + book);
			book.showBookInfo();
		}
		
		
		// 2 - 배열에 최적화 되어있음
		System.out.println("============ 향상된 for문 ============");
		for (Book book : lib) {
			book.showBookInfo();
		}
	}
}
