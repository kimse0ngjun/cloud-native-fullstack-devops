package cloud.controller;


import java.io.IOException;

import cloud.service.StudentInsertService;
import cloud.service.StudentListService;
import cloud.service.StudentService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.m")
public class StudentController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String urlName = requestURI.substring(contextPath.length());
		
		StudentService service = null;
		String nextPage = null;
		
		if (urlName.equals("/student.m")) {
			service = new StudentListService();
			service.execute(req, resp);
			nextPage = "student/studentInfo.jsp";
		}
		
		if (urlName.equals("/insert.m")) {
			service = new StudentInsertService();
			service.execute(req, resp);
			nextPage = "student/studentInfo.jsp";
		}
		
		RequestDispatcher dis = req.getRequestDispatcher(nextPage);
		dis.forward(req, resp);
	}
}
