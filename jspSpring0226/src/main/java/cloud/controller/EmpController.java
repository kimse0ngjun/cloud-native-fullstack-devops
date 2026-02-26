package cloud.controller;

import java.io.IOException;

import cloud.service.EmpListService;
import cloud.service.EmpService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do2")
public class EmpController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String urlName = requestURI.substring(contextPath.length());
		
		EmpListService service = null;
		String nextPage = null;
		
		if (urlName.equals("/list2.do2")) {
			service = new EmpService();
			service.execute(req, resp);
			nextPage = "list2.jsp";
		}
			
		RequestDispatcher dis = req.getRequestDispatcher(nextPage);
		dis.forward(req, resp);
	}
}
