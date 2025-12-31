package exam.ex07;

public class Result {
	
	int sum(int database, int digital, int program) {
		return database + digital + program;
	}
	
	double avg(int database, int digital, int program) {
		return (double) (database + digital + program)/3;
		
	}
	
	void menu() {
		System.out.println("============= 메뉴 =============");
		System.out.println("(1) 총점계산 (2) 평균계산 (3) 합격여부");
	}
}
