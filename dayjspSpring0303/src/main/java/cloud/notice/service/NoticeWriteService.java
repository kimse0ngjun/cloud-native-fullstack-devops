package cloud.notice.service;

import cloud.notice.dao.NoticeDAO;
import cloud.notice.dto.MemberDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class NoticeWriteService implements NoticeService{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		HttpSession session = req.getSession();
	    MemberDTO loginUser = (MemberDTO) session.getAttribute("loginUser");

	    if (loginUser == null) {
	        return;
	    }

	    String writer = loginUser.getUserId();  

	    NoticeDAO dao = new NoticeDAO();
	    dao.write(title, content, writer);
	}
}
