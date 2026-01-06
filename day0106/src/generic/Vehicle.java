package generic;

public class Vehicle {

	int fuel;
	String name;
	
	public Vehicle(String name) {
		
		this.name = name;
	}
	
	public void addFuel(int f) {
		fuel = fuel + f;
	}
}
