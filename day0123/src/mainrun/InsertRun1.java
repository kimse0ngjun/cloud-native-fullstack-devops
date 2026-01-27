package mainrun;

import dao.EmpDAO;
import dto.EmpDTO;

public class InsertRun1 {

	public static void main(String[] args) {
		
		EmpDAO dao = new EmpDAO();
		
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(7368);
		dto.setEname("JOHN");
		dto.setJob("MANAGER");
		dto.setMgr(7566);
		dto.setHiredate("2026-01-26");
		dto.setSal(2000);
		dto.setCom(800);
		dto.setDeptno(30);
			
	    int result = dao.insert(dto);
		
		if (result > 0) {
			System.out.println("데이터가 추가 되었습니다." + dto.getEname());
		} else {
			System.out.println("데이터 추가 실패.");
		}

	}

}
