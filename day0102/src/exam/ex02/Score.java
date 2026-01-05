package exam.ex02;

public class Score implements ScoreTest {

	@Override
	public double avg(int sum) {
		return sum / 3;
	}
	
	@Override
	public int sum(int kor, int eng, int mat) {
		// TODO Auto-generated method stub
		return kor + eng + mat;
	}
}
