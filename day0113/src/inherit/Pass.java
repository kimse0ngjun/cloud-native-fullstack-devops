package inherit;

public class Pass extends Result {

	// 메서드 : void result(int x, int y, int z, double avg)
	
	public void result(int x, int y, int z, double avg) {
		
		if (x < 40 || y < 40 || z < 40 || avg < 60) {
			System.out.println("불합격입니다.");
		} else {
			System.out.println("합격입니다.");
		}
	}
	
}
