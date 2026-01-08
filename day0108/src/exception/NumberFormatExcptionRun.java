package exception;

public class NumberFormatExcptionRun {

	public static void main(String[] args) {

		try {
			String s1 = "100";
			String s2 = "a100";
			
			int v1 = Integer.parseInt(s1);
			int v2 = Integer.parseInt(s2);
			
			int result = v1 + v2;
			System.out.println("result" + result);
		} catch (NumberFormatException e) {
			System.out.println("입력한 값이 올바른지 확인하세요.\n" + e.getMessage());
		}
	}

}
