package cloud.notice.service;

import cloud.notice.dao.NoticeDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeDeleteService implements NoticeService {
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		String id = req.getParameter("id");
		
		NoticeDAO dao = new NoticeDAO();
		dao.delete(id);
	}
	
}
