package bookP208_9.ex08;

public class Taxi {

	String companyName;
	int money;
	
	public Taxi(String companyName) { // 생성자 생성
		this.companyName = companyName;
	}
	
	public void take(int money) { // 택시비 지불
		this.money += money; // this.money = this.money + money;
	}
	
	public void showInfo() {
		System.out.println(companyName + "택시 수입은 " + money + "원 입니다." );
	}
}
