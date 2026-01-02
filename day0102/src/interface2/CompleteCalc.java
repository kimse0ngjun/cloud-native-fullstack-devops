package interface2;

public class CompleteCalc extends Calculator {  // Calc > Calculator > CompleteCalc

	@Override
	public int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public void showInfo() {
		System.out.println("CompleteCalc에서 정의되고 있음");
	}
}
