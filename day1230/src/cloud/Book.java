package cloud;

public class Book {
	private String bookName;
	private String author;
	
	public Book() { // 기본 생성자
		
	}
	
	public Book(String bookName, String author) {
		this.bookName=bookName;
		this.author=author;
	}
	
	public String getBookName() { // camel 표기법
		return this.bookName;
	}
	
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println("bookName = " + bookName + ", author = " + author);
	}
}
