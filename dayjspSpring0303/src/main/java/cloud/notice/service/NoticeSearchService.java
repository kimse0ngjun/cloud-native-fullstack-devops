package cloud.notice.service;

import java.util.ArrayList;

import cloud.notice.dao.NoticeDAO;
import cloud.notice.dto.NoticeDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeSearchService implements NoticeService{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		String searchName = req.getParameter("searchName");
		String searchValue = req.getParameter("searchValue");
		
		NoticeDAO dao = new NoticeDAO();
		ArrayList<NoticeDTO> list = dao.search(searchName, searchValue);
		
		req.setAttribute("list", list);
	}
}
