package p321ex07;

public class Bus extends Car {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("천연가스를 주유합니다.");
	}

	@Override
	public void wiper() {
		System.out.println("버스 기사가 문을 엽니다.");
	}
	
	@Override
	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}
	
}
