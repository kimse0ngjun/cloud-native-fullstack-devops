package collection;

public class Board {

	private String title;
	private String content;
	
	// 생성자 title, content 매개변수 처리
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}

	// get 메서드 생성
	
	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
}
