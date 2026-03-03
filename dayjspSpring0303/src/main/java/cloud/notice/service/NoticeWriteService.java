package cloud.notice.service;

import cloud.notice.dao.NoticeDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeWriteService implements NoticeService{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		String title = req.getParameter("title");
		String writer = req.getParameter("writer");
		String content = req.getParameter("content");
		
		NoticeDAO dao = new NoticeDAO();
		dao.write(title, writer, content);
	}
}
