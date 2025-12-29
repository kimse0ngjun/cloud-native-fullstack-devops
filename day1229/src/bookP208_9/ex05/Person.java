package bookP208_9.ex05;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCaffee(StarCoffee starCoffee, int money) {
		String msg = starCoffee.order(money);
		if (msg != null) {
			this.money = this.money - money;
			System.out.println(msg + " " + name + "님의 남은 돈은 " + this.money + "원입니다. ");
		}
	}
	
	public void buyBeanCaffee(BeanCoffee beanCoffee, int money) {
		String msg = beanCoffee.order(money);
		if (msg != null) {
			this.money = this.money - money;
			System.out.println(msg + " " + name + "님의 남은 돈은 " + this.money + "원입니다. ");
		}
	}
}
