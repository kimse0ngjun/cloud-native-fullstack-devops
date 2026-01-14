package anony;

public class Taxi implements Vehicle { // Vehicle 구현 객체

	@Override
	public void run() {
		System.out.println("택시가 달린다.");
	}
}
