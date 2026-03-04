package cloud.notice.service;

import cloud.notice.dao.NoticeDAO;
import cloud.notice.dto.NoticeDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeRetrieveService implements NoticeService {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		
		String id = req.getParameter("id");
		NoticeDAO dao = new NoticeDAO();
		NoticeDTO data = dao.retrieve(id);
		
		req.setAttribute("retrieve", data);
	}
}
