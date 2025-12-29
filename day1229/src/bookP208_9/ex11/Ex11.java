package bookP208_9.ex11;

public class Ex11 {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car k5 = factory.createCar();
		Car retona = factory.createCar();
		
		System.out.println(k5.getCarNum());
		System.out.println(retona.getCarNum());
	}
}
