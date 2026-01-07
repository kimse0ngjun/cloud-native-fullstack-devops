package collection;

import java.util.ArrayList;

public class MyStack {

	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) { // 입력(추가)
		arrayStack.add(data);
	}
	
	public String pop() {
		int length = arrayStack.size();
		if (length == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		} else {
			return (arrayStack.remove(length-1));
		}
	}
	
	public static void main(String[] args) {
	
		MyStack ms = new MyStack();
		ms.push("A");
		ms.push("B");
		ms.push("C");
		String pop1 = ms.pop(); // 마지막에 넣은 data 부터 출력 
		String pop2 = ms.pop();
		String pop3 = ms.pop();
		
		System.out.println("pop1 = " + pop1); // C
		System.out.println("pop2 = " + pop2); // B
		System.out.println("pop3 = " + pop3); // A
	}
}
