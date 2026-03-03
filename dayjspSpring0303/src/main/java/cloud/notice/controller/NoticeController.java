package cloud.notice.controller;

import java.io.IOException;

import cloud.notice.service.NoticeListService;
import cloud.notice.service.NoticeSearchService;
import cloud.notice.service.NoticeService;
import cloud.notice.service.NoticeWriteService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestId();
		String contextPath = req.getContextPath();
		String urlName = requestURI.substring(contextPath.length());
		
		NoticeService service = null;
		String nextPage = null;
		
		if (urlName.equals("/list.do")) {
			service = new NoticeListService();
			service.execute(req, resp);
			nextPage = "/notice/list.jsp";
		}
		
		if (urlName.equals("/search.do")) {
			service = new NoticeSearchService();
			service.execute(req, resp);
			nextPage = "/notice/list.jsp";
		}
		
		if (urlName.equals("/writeui.do")) {
			nextPage = "/notice/write.jsp";
		}
		
		if (urlName.equals("/write.do")) {
			service = new NoticeWriteService();
			service.execute(req, resp);
			nextPage = "list.do";
		}
		
		RequestDispatcher dis = req.getRequestDispatcher(nextPage);
		dis.forward(req, resp);
	}
}
