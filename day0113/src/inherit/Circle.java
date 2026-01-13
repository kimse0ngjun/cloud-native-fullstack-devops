package inherit;

public class Circle {

	final double PI = 3.14;
	
	public double circumferenceCircle(double r) {  // 둘레
		
		return 2 * PI * r;
	}
	
	public double AreaCircle(double r) { // 넓이
		
		return PI * r * r;
	}
	
}
