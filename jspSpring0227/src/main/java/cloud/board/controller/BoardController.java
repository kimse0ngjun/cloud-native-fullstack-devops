package cloud.board.controller;

import java.io.IOException;

import cloud.board.service.BoardDeleteService;
import cloud.board.service.BoardListService;
import cloud.board.service.BoardRetrieveService;
import cloud.board.service.BoardSearchService;
import cloud.board.service.BoardService;
import cloud.board.service.BoardUpdateService;
import cloud.board.service.BoardWriteService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class BoardController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String uriName = requestURI.substring(contextPath.length());
		
		BoardService service = null;
		String nextPage = null; 
	
		if (uriName.equals("/list.do")) {
			service = new BoardListService();
			service.execute(req, resp);
			nextPage = "/board/list.jsp";
		}
		
		if (uriName.equals("/writeui.do")) {
			nextPage = "/board/write.jsp";
		}
		
		if (uriName.equals("/write.do")) {
			service = new BoardWriteService();
			service.execute(req, resp);
			nextPage = "list.do";
		}
		
		if (uriName.equals("/retrieve.do")) {
			service = new BoardRetrieveService();
			service.execute(req, resp);
			nextPage = "/board/retrieve.jsp";
		}
		
		if (uriName.equals("/update.do")) {
			service = new BoardUpdateService();
			service.execute(req, resp);
			nextPage = "list.do";
		}
		
		if (uriName.equals("/delete.do")) {
			service = new BoardDeleteService();
			service.execute(req, resp);
			nextPage = "list.do";
		}
		
		if (uriName.equals("/search.do")) {
			service = new BoardSearchService();
			service.execute(req, resp);
			nextPage = "/board/list.jsp";
		}
		
		if (uriName.equals("/replyui.do")) {
			nextPage = "/board/reply.jsp";
		}
		
		
		RequestDispatcher dis = req.getRequestDispatcher(nextPage);
		dis.forward(req, resp);
	}
}
