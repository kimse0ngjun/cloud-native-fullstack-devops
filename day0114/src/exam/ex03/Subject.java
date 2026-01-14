package exam.ex03;

public class Subject {

	int kor, math, eng;
	
	
	public Subject() {
		
	}
	
	public int sum(int kor, int math, int eng) {
		return kor + math + eng;
	}
	
	
	public double avg(int kor, int math, int eng) {
		return (double) (kor + math + eng) / 3;
	}
}
