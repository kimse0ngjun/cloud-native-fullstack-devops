package bookP208_9.ex11;

public class CarFactory {
	
	private CarFactory() {} // 생성자를 통한 접근을 외부 클래스에서 할 수 없게 됨.
	
	private static CarFactory instance = new CarFactory();
	
	public static CarFactory getInstance() {
		if (instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
	
}
