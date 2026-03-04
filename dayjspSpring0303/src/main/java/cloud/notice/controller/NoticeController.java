package cloud.notice.controller;

import java.io.IOException;

import cloud.notice.service.JoinService;
import cloud.notice.service.LoginService;
import cloud.notice.service.LogoutService;
import cloud.notice.service.NoticeDeleteService;
import cloud.notice.service.NoticeListService;
import cloud.notice.service.NoticeRetrieveService;
import cloud.notice.service.NoticeSearchService;
import cloud.notice.service.NoticeService;
import cloud.notice.service.NoticeUpdateService;
import cloud.notice.service.NoticeWriteService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class NoticeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException {

	    String requestURI = req.getRequestURI();
	    String contextPath = req.getContextPath();
	    String urlName = requestURI.substring(contextPath.length());

	    NoticeService service = null;
	    String nextPage = null;
	    boolean isRedirect = false;

	    if (urlName.equals("/list.do")) {
	        service = new NoticeListService();
	        nextPage = "notice/list.jsp";
	    } 
	    else if (urlName.equals("/search.do")) {
	        service = new NoticeSearchService();
	        nextPage = "notice/list.jsp";
	    } 
	    else if (urlName.equals("/writeui.do")) {
	        nextPage = "notice/write.jsp";
	    } 
	    else if (urlName.equals("/write.do")) {
	        service = new NoticeWriteService();
	        nextPage = "list.do";
	        isRedirect = true;
	    } 
	    else if (urlName.equals("/retrieve.do")) {
	        service = new NoticeRetrieveService();
	        nextPage = "notice/retrieve.jsp";
	    } 
	    else if (urlName.equals("/update.do")) {
	        service = new NoticeUpdateService();
	        nextPage = "list.do";
	        isRedirect = true;
	    } 
	    else if (urlName.equals("/delete.do")) {
	        service = new NoticeDeleteService();
	        nextPage = "list.do";
	        isRedirect = true;
	    } 
	    else if (urlName.equals("/loginui.do")) {
	        nextPage = "notice/login.jsp";
	    } 
	    else if (urlName.equals("/joinui.do")) {
	        nextPage = "notice/join.jsp";
	    } 
	    else if (urlName.equals("/login.do")) {
	        service = new LoginService();
	        nextPage = "list.do";
	        isRedirect = true;
	    } 
	    else if (urlName.equals("/logout.do")) {
	        service = new LogoutService();
	        nextPage = "list.do";
	        isRedirect = true;
	    } 
	    else if (urlName.equals("/join.do")) {
	        service = new JoinService();
	        nextPage = "list.do";
	        isRedirect = true;
	    }

	    if (service != null) {
	        service.execute(req, resp);
	    }

	    if (nextPage != null) {

	        if (nextPage.endsWith(".do")) {
	            resp.sendRedirect(nextPage);
	            return;
	        }

	        RequestDispatcher dis = req.getRequestDispatcher(nextPage);
	        dis.forward(req, resp);
	    }
	}
}
