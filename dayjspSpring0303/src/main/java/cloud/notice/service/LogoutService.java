package cloud.notice.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LogoutService implements NoticeService {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		
		req.getSession().invalidate();
		
		try {
			resp.sendRedirect(req.getContextPath() + "/list.do");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
