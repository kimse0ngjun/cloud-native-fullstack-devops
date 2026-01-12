package waitnotify;

public class Student extends Thread {

	@Override
	public void run() {
		
		try {
			String title = LibraryRun.lib.lendBook();
			Thread.sleep(3000);
			LibraryRun.lib.returnBook(title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
