package cloud.controller;

import java.io.IOException;

import org.apache.jasper.tagplugins.jstl.core.If;

import cloud.service.DeptListService;
import cloud.service.DeptService;
import cloud.service.DeptWriteService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class DeptController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
//		System.out.println("requestURI = " + requestURI); // localhost:8080 이후 모든 url 경로 호출
		String contextPath = req.getContextPath();
//		System.out.println("contextPath = " + contextPath); // localhost:8080 뒤의 URL 경로 호출
		String urlName = requestURI.substring(contextPath.length()); 
//		System.out.println("service = " + service); // 실제 처리할 URL
		

		DeptService service = null;
		String nextPage = null;
		
		if (urlName.equals("/list.do")) {
			service = new DeptListService();
			service.execute(req, resp);
			nextPage = "list.jsp";		
		}
		
		if (urlName.equals("/writeui.do")) {
			nextPage = "writeui.jsp";
		}
		
		if (urlName.equals("/write.do")) {
			service = new DeptWriteService();
			service.execute(req, resp);
			nextPage = "list.do";
		}
		
		RequestDispatcher dis = req.getRequestDispatcher(nextPage);
		dis.forward(req, resp);
		
		
	}
	
}
