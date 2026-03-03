package cloud.board.service;

import cloud.board.dao.BoardDao;
import cloud.board.dto.PageTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardPageService implements BoardService {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		
		int curPage = 1;
		
		if (req.getParameter("curPage") != null) {
			curPage = Integer.parseInt(req.getParameter("curpage"));
		}
		
		BoardDao dao = new BoardDao();
		PageTO list = dao.page(curPage);
		
		req.setAttribute("list", list.getList());
		req.setAttribute("page", list);
	}
}
