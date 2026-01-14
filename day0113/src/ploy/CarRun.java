package ploy;

public class CarRun {

	public static void main(String[] args) {

		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
//			System.out.println(", " + problemLocation);
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire(15, "앞왼쪽");
				break;
			case 2:
				System.out.println("앞오른쪽 kumhoTire로 교체");
				car.frontRightTire = new KumhoTire(15, "앞오른쪽");
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire(15, "뒤왼쪽");
				break;
			case 4:
				System.out.println("뒤오른쪽 kumhoTire로 교체");
				car.backRightTire = new KumhoTire(15, "뒤오른쪽");
				break;
			default:
				System.out.println("타이어의 갯수는 기본 4개입니다.");
				break;
			} 
			System.out.println("--------------------------------------------------");
		}
	}

}
