package exam01;


public class Music implements Runnable { // 구현체 - Runnable -> run 메서드밖에 없음

	@Override
	public void run() {
		
		for (int i = 0; i < 3; i++) {
			System.out.println("음악을 감상합니다.");
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
