package cloud.notice.service;

import cloud.notice.dao.MemberDAO;
import cloud.notice.dto.MemberDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginService implements NoticeService {
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		MemberDAO dao = new MemberDAO();
		MemberDTO member = dao.loginCheck(id, pwd);
		
	    if (member != null) {
	        HttpSession session = req.getSession();
	        session.setAttribute("loginUser", member);

	        req.setAttribute("loginSuccess", true);
	    } else {
	        req.setAttribute("loginSuccess", false);
	        req.setAttribute("error", "아이디 또는 비밀번호가 틀렸습니다.");
	    }
	}

}
