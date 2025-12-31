package cloud;

public class Tiger extends Animal {
	
	public Tiger() {
		move();
	}
	
	@Override
	public void move() {
		System.out.println("호랑이는 4발로 움직인다.");
	}
}
