package method;

public class Score {

	int kor, mat, eng, sum;
	double svg;
	
	// 메서드 명 : int total(), double average();
	
	public Score(int kor, int mat, int eng) {
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}
	
	public int total() {
		sum = kor + mat + eng;
		return sum;
	}
	
	public double average() {
		svg = sum / 3;
		return svg;
	}
}
