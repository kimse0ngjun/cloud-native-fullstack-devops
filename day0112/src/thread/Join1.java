package thread;

public class Join1 extends Thread {
	
	// 1  
	// MyThread가 Thread를 상속받고, 멤버인 run() 메서드를 오버라이드(Overriding)하여 실행 코드를 작성한다. 
	// 실행 클래스에서 MyThread 객체생성하여 start() 메서드를 실행한다.
	
	int start;
	int end;
	int sum;
	
	public Join1(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		for (int i = start; i <= end; i++) {
			sum += i;
		}
	}
}
