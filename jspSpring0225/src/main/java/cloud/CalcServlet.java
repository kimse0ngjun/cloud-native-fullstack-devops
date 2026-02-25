package cloud;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVarsionUID = 1L;
	
	public CalcServlet() {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int n1 = Integer.parseInt(req.getParameter("n1"));
		int n2 = Integer.parseInt(req.getParameter("n2"));
		String op = req.getParameter("op");
		
		long result = 0;
		
		switch (op) {
		
		case "+": result = n1+n2; break; 
		case "-": result = n1-n2; break; 
		case "*": result = n1*n2; break; 
		case "/": result = n1/n2; break; 
			
	}
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.append("<html><body<h2>계산기 서블릿</h2><hr>").append("계산 결과: "+ result +"</body></html>");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
