package inherit;

public class Result {

	// 메서드 작성: int sum(int x, int y, int z), double avg(int z),
	
	public int sum(int x, int y, int z) {
		return x + y + z;
	}
	
	public double avg(int x) {
		
		return (double) x/3;
	}
	
	// void menu()
	
	void menu() {
		System.out.println("========== 메뉴 =================");
		System.out.println("(1) 총점계산 (2) 평균계산 (3) 합격여부");
	}
}
