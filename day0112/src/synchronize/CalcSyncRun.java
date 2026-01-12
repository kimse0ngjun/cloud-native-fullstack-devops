package synchronize;

public class CalcSyncRun {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		
		User1 u1 = new User1();
		u1.setCalc(calc);
		u1.start();
		
		User2 u2 = new User2();
		u2.setCalc(calc);
		u2.start();
	}

}
