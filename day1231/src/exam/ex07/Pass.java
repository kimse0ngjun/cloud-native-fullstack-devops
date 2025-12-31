package exam.ex07;

public class Pass extends Result {
	
	void result(int database, int digital, int program, double avg) {
		if (database < 40 || digital < 40 || program < 40 || avg < 60) {
			System.out.println("불합격입니다."); 
		} else {
			System.out.println("합격입니다.");
		}
	}
}
