package cloud.service;

import java.util.List;

import cloud.dao.DeptDao;
import cloud.dto.DeptDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeptListService implements DeptService  {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		DeptDao dao = new DeptDao();
		List<DeptDto> list = dao.list();
		request.setAttribute("list", list);
	}
}
