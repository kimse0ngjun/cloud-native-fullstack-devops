package waitnotify;

import java.util.ArrayList;

public class Library {

	private ArrayList<String> shelf = new ArrayList<String>();
	
	public Library() {
		
		shelf.add("태맥산맥 1");
		shelf.add("태맥산맥 2");
		shelf.add("태맥산맥 3");
	}
	
	public synchronized String lendBook() throws Exception {
		
		Thread th = Thread.currentThread();
		while (shelf.size() == 0) {
			System.out.println(th.getName() + " waiting start");
			wait();
			System.out.println(th.getName() + " waiting end");
		}
		
		String book = shelf.remove(0);
		System.out.println(th.getName() + " : " + book + " lend");
		
		
		return book; // 꼭 반환값 확인
	}
	
	public synchronized void returnBook(String book) throws Exception {
		
		Thread th = Thread.currentThread();
		shelf.add(book);
		notifyAll(); // 알림
		System.out.println(th.getName() + " : " + book + " return");
		
		
	}
}
