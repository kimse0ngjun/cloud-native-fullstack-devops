package ploy;

public class Car {

	Tire frontLeftTire = new Tire(6, "앞왼쪽"); // 6번 회전 펑크
	Tire frontRightTire = new Tire(2, "앞오른쪽"); // 2번 회전 펑크
	Tire backLeftTire = new Tire(3, "뒤왼쪽"); // 6번 회전 펑크
	Tire backRightTire = new Tire(4, "뒤오른쪽"); // 2번 회전 펑크
	
	int run() {
		
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
