package exam01;

public class MediaRun {

	/*
	 동영상과 음악을 재생하는 두 가지 스레드를 실행하는 코드를 작성
	 */
	
	public static void main(String[] args) throws Exception {
		
		Thread movieThread = new Movie();
		movieThread.start();
		
		Thread musicThread = new Thread(new Music());
//		Thread musicThread = new Thread(movieThread);
		musicThread.start();
	
		
	}
}
