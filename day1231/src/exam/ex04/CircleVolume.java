package exam.ex04;

import exam.ex03.Circle;

public class CircleVolume extends Circle {
	
	public final double PI = 3.141;
	
	public double circleSphere(double r) {
		return (4/3)* r * r * r * PI;
	}
	
	public double circumference(double r) {
		return 2 * PI * r;
		
	}
	
	public double extent(double r) {
		return r * r * PI;
	}

}
