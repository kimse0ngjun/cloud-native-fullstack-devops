package exam01;


public class Movie extends Thread { // 상속

	@Override
	public void run() {
		
		for (int i = 0; i < 3; i++) {
			System.out.println("영화를 감상합니다.");
			
			try {
				sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
