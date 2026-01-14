package exception;

public class TryCatchFinallyRun {
	
	public static void main(String[] args) {
		
		String[] strArray = {"10", "20"};
		int value = 0;
		
		for (int i = 0; i < strArray.length; i++) { 
			try {
				value = Integer.parseInt(strArray[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했습니다." + e.getMessage());
			} catch (Exception e) {
				System.out.println("숫자로 변환할 수 없습니다.");
			} finally {
				System.out.println("value = " + value);
			}
		}
	}
}
