package cloud.board.service;

import cloud.board.dao.BoardDao;
import cloud.board.dto.BoardDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardRetrieveService implements BoardService{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		
		String num = req.getParameter("num");
		BoardDao dao = new BoardDao();
		BoardDto data = dao.retrieve(num);
		
		req.setAttribute("retrieve", data);
		
		System.out.println("num = " + num);
	}
}
