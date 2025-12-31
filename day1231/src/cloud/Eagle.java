package cloud;

public class Eagle extends Animal {
	
	public Eagle() {
		move();
	}
	
	@Override
	public void move() {
		System.out.println("독수리는 하늘을 난다.");
	}
}
