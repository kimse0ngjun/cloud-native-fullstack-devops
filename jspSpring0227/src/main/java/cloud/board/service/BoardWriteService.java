package cloud.board.service;

import cloud.board.dao.BoardDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardWriteService implements BoardService {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		
		String title = req.getParameter("title");
		String author = req.getParameter("author");
		String content = req.getParameter("content");
		
		BoardDao dao = new BoardDao();
		dao.write(title, author, content);
	}
}
