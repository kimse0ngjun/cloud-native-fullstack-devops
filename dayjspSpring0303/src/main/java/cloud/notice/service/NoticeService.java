package cloud.notice.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface NoticeService {

	void execute(HttpServletRequest request, HttpServletResponse response);
}
