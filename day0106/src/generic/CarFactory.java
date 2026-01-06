package generic;

public class CarFactory<T extends Car> { // 차를 생각하며 제네릭 처리

	public void addFuel(T t) { // 매개변수 제네릭 
		t.addFuel(100);
		System.out.println("연료를 충전합니다.");
	}
	
	public void fixCar(T t) { // 매개변수 제네릭
		System.out.println(t.name + "를 수리했습니다.");
	}
}
