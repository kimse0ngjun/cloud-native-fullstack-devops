package abstractEx;

public class Taxi extends Car {

	@Override
	public void drive() { // 추상 메서드는 상속 받을 때 무조건 오버라이드 어노테이션을 받아야함
		System.out.println("택시를 운전합니다.");
	}
	
}
