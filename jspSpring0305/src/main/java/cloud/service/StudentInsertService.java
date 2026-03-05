package cloud.service;

import cloud.dao.StudentDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentInsertService implements StudentService{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		
		String username = req.getParameter("username");
		String univ = req.getParameter("univ");
		String birth = req.getParameter("birth");
		String email = req.getParameter("email");
		
		StudentDAO data = new StudentDAO();
		data.insert(username, univ, birth, email);
	}
}
