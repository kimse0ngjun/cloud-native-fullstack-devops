package practice;

public class DriverRun {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus(); // 2
		
		// 1
		driver.drive(new Taxi());
		// 2
		driver.drive(bus);
		driver.drive(new Sedan());
		
//		Taxi taxi = new Taxi();
//		taxi.run();
	}

}
