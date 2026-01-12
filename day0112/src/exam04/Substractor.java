package exam04;

public class Substractor extends Thread {
	
	@Override
	public synchronized void run() {
		
		synchronized (CounterRun.myCounter) {
			
			int n = CounterRun.myCounter.getNumber();
			n = n - 10;
			try {
				sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			CounterRun.myCounter.setNumber(n);
			System.out.println(CounterRun.myCounter.getNumber() + ":Substractor");
		}
	}
}
