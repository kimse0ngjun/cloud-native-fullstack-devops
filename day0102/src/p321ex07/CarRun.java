package p321ex07;

public class CarRun {

	public static void main(String[] args) {
//		Bus bus = new Bus();
//		AutoCar authCar = new AutoCar();
		
		Car bus = new Bus(); // < 부모 타입 + 자식 생성자 >
		Car autoCar = new AutoCar();
		
		bus.run();
		autoCar.run();
		
		bus.refuel();
		autoCar.refuel();
		
		Bus bus1 = (Bus) bus; // casting(강제형변환)
		bus.takePassenger();
		AutoCar aCar = (AutoCar) autoCar;
		autoCar.load();
		
//		bus.takePassenger();
//		autoCar.load();
		
		bus.wiper();
		autoCar.wiper();
		
		bus.stop();
		autoCar.stop();
		
	}
}
