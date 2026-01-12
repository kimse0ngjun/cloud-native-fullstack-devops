package synchronize;

public class BankSyncRun {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws Exception {

		Hasband hb = new Hasband();
		hb.start();
		
		Thread.sleep(500);
		
		Wife w = new Wife();
		w.start();
		
		
	}

}
