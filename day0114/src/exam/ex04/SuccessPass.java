package exam.ex04;

public class SuccessPass extends Pass {

	int a, b, c;
	
	@Override
	public double avg(int a, int b, int c) {
		return (double) (a+b+c)/3;
	}

	public double sPass(int a, int b, int c) {
		if (a < 40 || b < 40 || c < 40 || avg(a, b, c) < 60) {
			System.out.println("불합격입니다.");
		} else {
			System.out.println("합격입니다.");
		}
		return 0;
	}
}
