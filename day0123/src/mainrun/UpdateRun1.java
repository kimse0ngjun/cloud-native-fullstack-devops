package mainrun;

import dao.EmpDAO;
import dto.EmpDTO;

public class UpdateRun1 {

	public static void main(String[] args) {
		
		EmpDTO dto = new EmpDTO();
		
		dto.setEmpno(7844);
		dto.setEname("CONNER");
		dto.setJob("ANALYST");
		dto.setSal(3000);
		dto.setCom(1000);
		
		EmpDAO dao = new EmpDAO();
		
		int result = dao.update(dto);
		
		if (result > 0) {
			System.out.println("데이터 수정 완료 : " + dto.getEname());
		} else {
			System.out.println("데이터 수정 안됨.");
		}

	}

}
