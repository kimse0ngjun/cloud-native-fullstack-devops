package inherit;

public class Avg extends Score {

	// 메서드 작성 : double avg(int x)
	
	@Override
	public int sum(int x, int y, int z) {
		return x + y + z;
	}
	
	public double avg(int x) {
		
		return x / 3;
	}
}
