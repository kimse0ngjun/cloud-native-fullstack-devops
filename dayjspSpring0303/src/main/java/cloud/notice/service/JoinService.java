package cloud.notice.service;

import cloud.notice.dao.MemberDAO;
import cloud.notice.dto.MemberDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class JoinService implements NoticeService{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {

	    String id = req.getParameter("id");
	    String pwd = req.getParameter("pwd");
	    String name = req.getParameter("name");

	    MemberDAO dao = new MemberDAO();

	    try {
	        if (dao.idExists(id)) {
	            req.setAttribute("joinSuccess", false);
	            req.setAttribute("error", "이미 존재하는 아이디입니다.");
	            return;
	        }

	        MemberDTO member = new MemberDTO();
	        member.setUserId(id);
	        member.setUserPwd(pwd);
	        member.setUserName(name);

	        dao.insertMember(member);

	        req.setAttribute("joinSuccess", true);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
