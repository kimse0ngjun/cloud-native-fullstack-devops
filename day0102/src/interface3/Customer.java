package interface3;

public class Customer implements Buy, Sell {

	
	@Override
	public void buy() {
		System.out.println("물건을 삽니다.");
	}
	
	@Override
	public void sell() {
		System.out.println("물건을 팝니다.");
	}
}
