package exception;

public class NullPointRun {

	public static void main(String[] args) {
		
		try {
			String data = null;
			System.out.println(data.toString());
			
		} catch (NullPointerException e) { // 구체적 Exception, e 변수안으로 들어감
//			e.printStackTrace();
			System.out.println("예외가 발생했습니다." + e.getMessage());
		} catch (Exception e) { // 모든 예외
	
		}
	}
}
