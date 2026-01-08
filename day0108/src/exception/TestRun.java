package exception;

public class TestRun {

	public static void main(String[] args) {
		
		try {
			// 정상 실행, 실행 코드 작성 영역
			int num = 10;
			System.out.println(num / 1);
			System.out.println("try 구문 : 정상 실행");
		} catch (Exception e) {
			System.out.println("catch 구문 : 예외 발생");
		} finally {
			// 무조건 실행
			System.out.println("finally 구문 : 무조건 발생");
		}
	}

}
