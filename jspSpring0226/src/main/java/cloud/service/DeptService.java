package cloud.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface DeptService {
	
	void execute(HttpServletRequest request, HttpServletResponse response);
}
