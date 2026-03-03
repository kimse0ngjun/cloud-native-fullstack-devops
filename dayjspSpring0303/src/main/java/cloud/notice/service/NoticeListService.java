package cloud.notice.service;

import java.util.List;

import cloud.notice.dao.NoticeDAO;
import cloud.notice.dto.NoticeDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeListService implements NoticeService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		NoticeDAO dao = new NoticeDAO();
		List<NoticeDTO> list = dao.list();
		request.setAttribute("list", list);
	}
}
