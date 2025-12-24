package cloud;


public class Score { // 클래스 안의 메소드 선언 시 scanner 등 선언하면 안됨 (단일 책임 원칙(SRP))
	
	int kor, math, eng, sum;
	double avg;
	
	// get(출력), set(입력) 메서드	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor=kor; // 생성자
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math=math;
	}
	
	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	int total(int kor, int math, int eng) { 
		int result = kor + math + eng;
		return result;
			
	}
		
	double avg(int kor, int math, int eng) {
		avg = total(kor, math, eng)/3.0; // total 메서드에 선언한 변수들 사용
		return avg;
	}
}


