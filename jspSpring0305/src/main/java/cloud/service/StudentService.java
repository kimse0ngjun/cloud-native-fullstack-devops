package cloud.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface StudentService {

	void execute(HttpServletRequest request, HttpServletResponse response);
}
