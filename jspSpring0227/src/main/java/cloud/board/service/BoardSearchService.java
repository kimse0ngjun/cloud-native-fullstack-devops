package cloud.board.service;

import java.util.ArrayList;

import cloud.board.dao.BoardDao;
import cloud.board.dto.BoardDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardSearchService implements BoardService {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		String searchName = req.getParameter("searchName");
		String searchValue = req.getParameter("searchValue");
		
		BoardDao dao = new BoardDao();
		ArrayList<BoardDto> list = dao.search(searchName, searchValue);
		
		req.setAttribute("list", list);
	}
}
