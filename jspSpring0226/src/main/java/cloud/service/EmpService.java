package cloud.service;

import java.util.List;

import cloud.dao.EmpDao;
import cloud.dto.EmpDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmpService implements EmpListService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		EmpDao dao = new EmpDao();
		List<EmpDto> list = dao.list();
		request.setAttribute("list2", list);
	}
}
