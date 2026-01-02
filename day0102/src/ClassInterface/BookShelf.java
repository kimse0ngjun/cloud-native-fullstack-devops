package ClassInterface;

public class BookShelf extends Shelf implements Queue {
	
	@Override
	public void shelf() {
		System.out.println("BookShelf.shelf() 실행");
	}
	
	@Override
	public void queue() {
		System.out.println("BookShelf.queue() 실행");
	}
}
