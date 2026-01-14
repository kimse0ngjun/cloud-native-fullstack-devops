package anony;

public class Anonymous {

	Vehicle field = new Vehicle() {
	
		@Override
		public void run() {
			Driver driver = new Driver();
			Bus bus = new Bus();
			Taxi taxi = new Taxi();
			driver.drive(bus);
		}
	};
	
	void method1() {
		Vehicle localval = new Vehicle() {
			
			@Override
			public void run() {
				Driver driver = new Driver();
				Bus bus = new Bus();
				Taxi taxi = new Taxi();
				driver.drive(taxi);
			}
		};
		localval.run(); //
	}
	
	void method2(Vehicle vehicle) {
		vehicle.run();
	}
}
