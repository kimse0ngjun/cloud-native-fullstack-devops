package cloud;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginInfo")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		String userId = req.getParameter("userid");
		String pwd1 = req.getParameter("pwd1");
		String pwd2 = req.getParameter("pwd2");
		String maskedPwd1 = "";
		if (pwd1 != null) {
			maskedPwd1 = "*".repeat(pwd1.length());
		}
		
		String maskedPwd2 = "";
		if (pwd2 != null) {
			maskedPwd2 = "*".repeat(pwd2.length());
		}
		String level = req.getParameter("level");
		String fullname = req.getParameter("fullname");
	    String email = req.getParameter("email");
	    String tel = req.getParameter("tel");
		
		out.print("<html><body>");
		out.print("아이디 : " + userId + "<br>");
		out.print("비밀번호 : " + maskedPwd1 + "<br>");
		out.print("비밀번호 확인 : " + maskedPwd2 + "<br>");
		out.print("회원등급 : " + level + "<br>");
		out.print("이름 : " + fullname + "<br>");
	    out.print("이메일 : " + email + "<br>");
	    out.print("전화 : " + tel + "<br>");
		out.print("</body></html>");
	}
}
