package generic;

public class FactoryRun {

	public static void main(String[] args) {

//		CarFactory<Taxi> carFactory = new CarFactory<Taxi>();
//		CarFactory<Boat> carFactory3 = new CarFactory<Boat>(); // Car에서 상속 받은것들만 생성 가능

		CarFactory<Car> carFactory2 = new CarFactory<Car>();
		AutoCar car = new AutoCar("홍카");
		carFactory2.fixCar(car);
		
		ShipFactory<Ship> shipFactory = new ShipFactory<Ship>();
		Cruze cruze = new Cruze("펜스타 크루즈");
		shipFactory.fixShip(cruze);
	}

}
