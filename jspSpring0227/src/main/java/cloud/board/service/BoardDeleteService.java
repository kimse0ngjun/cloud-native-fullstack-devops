package cloud.board.service;

import cloud.board.dao.BoardDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardDeleteService implements BoardService {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		
		String num = req.getParameter("num");
		
		BoardDao dao = new BoardDao();
		dao.delete(num);
	}
}
