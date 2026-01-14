package interface1;

public class DriverRun {

	public static void main(String[] args) { // 매개변수의 다형성
		
		// 버스가 달린다. 택시가 달린다.

		Driver driver = new Driver();
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
