package bookP208_9.ex05;

public class StarCoffee {
	int money;
//	Menu menu = new Menu();
	
	public String order(int money) {
		this.money = this.money + money;
		if (money == Menu.STARAMERICANO) {
			return "별다방 아메리카노를 구입했습니다.";
		} else if (money == Menu.STARLATTE) {
			return "별다방 라떼를 구입했습니다.";
		} else {
			return null;
		}
	}
}
