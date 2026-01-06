package generic;

public class ShipFactory <T extends Ship>{ // 배를 생각하며 제너릭

	public void addFuel(T t) { // 매개변수 제네릭 
		t.addFuel(100);
	}
	
	public void fixShip(T t) { // 매개변수 제네릭
		System.out.println(t.name + "를 수리했습니다.");
	}
}
