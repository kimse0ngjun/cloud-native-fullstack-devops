package p319ex05;

import java.util.ArrayList;

public class CarRun {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		for (Car car : carList) {
			car.run();
			System.out.println("===========================");
		}
	}
}
