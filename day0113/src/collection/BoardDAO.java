package collection;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	// List<Board> getBoardList() 메서드 생성, 메서드 내에서 List.add() 3개 추가
	
	public List<Board> getBoardList() {
		
		List<Board> list = new ArrayList<Board>(); // ArrayList 가져오기
		
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		
		return list;
	}
}
