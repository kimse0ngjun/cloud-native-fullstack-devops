package mainrun;

import dao.DeptDAO;
import dto.DeptDTO;

public class InsertRun {

	public static void main(String[] args) {
		
		DeptDAO dao = new DeptDAO();
		
		DeptDTO dto = new DeptDTO();
		dto.setDeptno(50);
		dto.setDname("DEVELOP");
		dto.setLoc("BUSAN");
		
		int result = dao.insert(dto);
		
		if (result > 0) {
			System.out.println("데이터 저장 성공: " + dto.getDname());
		} else {
			System.out.println("데이터 저장 실패.");
		} 
	}

}
