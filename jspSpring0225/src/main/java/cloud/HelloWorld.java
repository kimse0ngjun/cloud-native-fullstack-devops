package cloud;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "MyServlet", urlPatterns = {"/xxx", "/yyy"})
public class HelloWorld extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("get 요청");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HelloServlet 실행!");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy 요청");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init 요청");
	}
}
