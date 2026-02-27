package cloud.board.service;

import java.util.ArrayList;

import cloud.board.dao.BoardDao;
import cloud.board.dto.BoardDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardListService implements BoardService {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		
		BoardDao dao = new BoardDao();
		ArrayList<BoardDto> list = dao.list();
		
		req.setAttribute("list", list);
	}
}
