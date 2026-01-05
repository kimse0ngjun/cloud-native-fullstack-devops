package exam.ex03;

public class CircleRadius implements CircleTest {

	@Override
	public double circumstance(double r) {
		return 2 * PI * r;
	}

	@Override
	public double area(double r) {
		return r * r * PI;
	}

	
}
