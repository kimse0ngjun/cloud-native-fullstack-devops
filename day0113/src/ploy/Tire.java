package ploy;

public class Tire {

	public int maxRotation; // 최대 회전 수
	public int accumulationRotation; // 누적 회전수
	public String location; // 타이어의 위치
	
	
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() {
		accumulationRotation++;
		if (accumulationRotation < maxRotation) {
			System.out.println(location + "Tire 수명 : " +  
		(maxRotation - accumulationRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "Tire 펑크");
			return false;
		}
	}
	
}
