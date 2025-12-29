package bookP208_9.ex05;

public class Ex05 {
	
//	String name;
//	String place;
//	int money;
//	String coffeeName;
//	
//	public Ex05(String name, String place, int money, String coffeeName) {
//		this.name = name;
//		this.place = place;
//		this.money = money;
//		this.coffeeName = coffeeName;
//	}
//	
//	public void showInfo() {
//		System.out.println(name + "씨는 " + place + "에서 " + money + "원을 지불 후, " + coffeeName + "를 사먹었습니다.");
//	}
	
	public static void main(String[] args) {
		
		Person ps = new Person("홍길동", 10000);
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
//		Menu menu = new Menu();
		
		ps.buyStarCaffee(starCoffee, Menu.STARAMERICANO);
		ps.buyBeanCaffee(beanCoffee, Menu.BEANLATTE);
	}
}
