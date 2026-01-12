package synchronize;

public class Bank {

	private int money = 10000;
	
	public void saveMoney(int save) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(1000); // 1초
		} catch (Exception e) {
			e.printStackTrace();
		}
		setMoney(m + save); // 기존에 있던 m + save
	}
	
	public void minusMoney(int minus) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(200); // 0.2초
		} catch (Exception e) {
			e.printStackTrace();
		}
		setMoney(m - minus); 
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
