package exam04;

public class CounterRun {

	public static Counter myCounter = new Counter(10);
	
	public static void main(String[] args) throws Exception {

		Adder adder = new Adder();
		Substractor substractor = new Substractor();
		adder.start();		
		substractor.start();
		
		Thread.sleep(1000);
		System.out.println("CountRun = " + myCounter.getNumber());
		
	}

}
