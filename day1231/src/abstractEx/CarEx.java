package abstractEx;

public class CarEx {
	
	public static void main(String[] args) {
		System.out.println("===== 택시 =====");
		Car car = new Taxi(); // 자식 생성자에서 가져옴
//		Car car = new Car();  // 추상 클래스는 객체 생성 할 수 없다. 추상메서드를 가지고 있기 때문
		car.run();
	}
}
