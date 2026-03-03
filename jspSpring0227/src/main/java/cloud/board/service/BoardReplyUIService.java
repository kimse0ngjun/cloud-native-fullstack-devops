package cloud.board.service;

import cloud.board.dao.BoardDao;
import cloud.board.dto.BoardDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardReplyUIService implements BoardService {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String num = req.getParameter("num");
		BoardDao dao = new BoardDao();
		BoardDto data = dao.replyui(num);
		req.setAttribute("replyui", data);
	}
}
