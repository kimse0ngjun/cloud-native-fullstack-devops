package p321ex07;

public class AutoCar extends Car {

	@Override
	public void run() {
		System.out.println("자동차가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("휘발류를 주유합니다.");
	}
	
	@Override
	public void wiper() {
		System.out.println("차가 문을 엽니다.");
	}
}
