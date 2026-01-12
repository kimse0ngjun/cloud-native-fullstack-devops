package exam04;

public class Counter {

	private int number;
	
	public Counter(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
	
//	public synchronized int getNumber() {
//		return number;
//	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
