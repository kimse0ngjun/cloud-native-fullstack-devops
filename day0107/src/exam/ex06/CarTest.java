package exam.ex06;

public class CarTest {

	public static void main(String[] args) {
		CarFactory ft = CarFactory.getInstance();
		Car sonata1 = ft.createCar("연수 차");
		Car sonata2 = ft.createCar("연수 차");
		System.out.println(sonata1 == sonata2);
		
		Car avante1 = ft.createCar("승연 차");
		Car avante2 = ft.createCar("승연 차");
		System.out.println(avante1 == avante2);
		
		System.out.println(avante1 == sonata1);
	}
}
