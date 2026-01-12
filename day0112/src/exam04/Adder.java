package exam04;

public class Adder extends Thread {

	@Override
	public void run() {
		
		synchronized (CounterRun.myCounter) { // 동기화 블럭 추가
			int n = CounterRun.myCounter.getNumber();
			n = n + 20;
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			CounterRun.myCounter.setNumber(n);
			System.out.println(CounterRun.myCounter.getNumber() + ":Adder");
		}
	}
}
