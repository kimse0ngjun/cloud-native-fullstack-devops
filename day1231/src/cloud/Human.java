package cloud;

public class Human extends Animal {

	public Human() {
		move();
	}
	
	@Override
	public void move() {
		System.out.println("사람은 두발로 움직인다.");
	}
}
