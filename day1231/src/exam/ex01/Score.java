package exam.ex01;
/*
 문제1. Score 클래스를 만들고, 국어, 수학, 영어 3과목의 점수를 각각 입력받아서 
 총점을 출력하는 자바프로그램을 작성하여 보시오. 
 단, 총점은 메소드를 사용하여 풀이하시오.
 */
public class Score {
	
	int kor;
	int math;
	int eng;
	
	public int sum(int kor, int math, int eng) {
		return kor+math+eng;
	}
}
