package mainrun;

import java.util.List;

import dao.EmpDAO;
import dto.EmpDTO;

public class SelectRun1 {

	public static void main(String[] args) {
		
		EmpDAO dao = new EmpDAO();
		
		List<EmpDTO> list = dao.select();
		
		if (list.isEmpty()) {
			System.out.println("조회할 데이터 없어요.");
		} else {
			for (EmpDTO empDTO : list) {
				System.out.println(empDTO.getEmpno() + " \t " + empDTO.getEname() + " \t " + empDTO.getJob() + " \t " + empDTO.getMgr() + " \t " + empDTO.getHiredate() + " \t " + empDTO.getSal() + " \t " + empDTO.getCom() + " \t " + empDTO.getDeptno());
			}
		}
		
	}

}
