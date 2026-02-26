package cloud.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface EmpListService {

	void execute(HttpServletRequest request, HttpServletResponse response);
}
