package interface1;

public class CarRun {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.run();
		
		car.frontLeftTire = new KumhoTire();
		car.frontRightTire = new KumhoTire();
		
		car.run();
	}

}
