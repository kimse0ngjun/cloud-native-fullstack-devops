package ClassInterface;

public class BookShelfRun {

	public static void main(String[] args) {
		
		BookShelf bs = new BookShelf();
		bs.shelf();
		bs.queue();
		
		Shelf sf = new BookShelf();
		Queue qe = new BookShelf();
		sf.shelf();
		qe.queue();
	}
}
