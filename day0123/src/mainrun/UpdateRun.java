package mainrun; 

import dao.DeptDAO;
import dto.DeptDTO;

public class UpdateRun {

	public static void main(String[] args) {

		DeptDAO dao = new DeptDAO();
		
		DeptDTO dto = new DeptDTO();
		dto.setDeptno(50); // where
		dto.setDname("DEVELOP2"); // set
		dto.setLoc("BUSAN"); // set
		
		int result = dao.update(dto);
		
		if (result > 0) {
			System.out.println("데이터가 수정되었습니다 : " + dto.getDname());
		} else {
			System.out.println("데이터 수정 실패");
		}
		
	}

}
