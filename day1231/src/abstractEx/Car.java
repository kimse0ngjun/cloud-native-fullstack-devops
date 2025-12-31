package abstractEx;

public abstract class Car { // 추상 클래스는 일반 메서드, 추상 메서드를 멤버로 가질 수 있다.

	public abstract void drive(); // 추상 메서드
	
	public void startCar() { // 일반 메서드
		System.out.println("차에 시동을 겁니다.");
	}
	
	final public void run() {
		startCar();
		drive();
	}
}
