package collection;

import java.util.ArrayList;

public class MyQueue {

	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void push(String data) { // 입력(추가)
		arrayQueue.add(data);
	}
	
	public String pop() {
		int length = arrayQueue.size();
		if (length == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		} else {
			return (arrayQueue.remove(0));
		}
	}
	
	public static void main(String[] args) {
		MyQueue mq = new MyQueue();
		
		mq.push("A");
		mq.push("B");
		mq.push("C");
		
		String pop1 = mq.pop();
		String pop2 = mq.pop();
		String pop3 = mq.pop();
		System.out.println("pop1 = " + pop1);
		System.out.println("pop2 = " + pop2);
		System.out.println("pop3 = " + pop3);
		
		
	}
}
