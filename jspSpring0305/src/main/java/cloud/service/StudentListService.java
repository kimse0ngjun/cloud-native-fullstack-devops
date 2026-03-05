package cloud.service;

import java.util.List;

import cloud.dao.StudentDAO;
import cloud.dto.StudentDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentListService implements StudentService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		StudentDAO dao = new StudentDAO();
		List<StudentDTO> student = dao.list();
		
		request.setAttribute("student", student);
	}
}
