package synchronize;

public class Wife extends Thread{

	
	@Override
	public void run() {
		
		synchronized (BankSyncRun.myBank) {
			System.out.println("출금 작업을 시작합니다.");
			BankSyncRun.myBank.minusMoney(1000);
			System.out.println("minusMoney(1000) 작업이 잔행되어 잔액이 "
			+ BankSyncRun.myBank.getMoney() + "원입니다.");
		}
	}
}
