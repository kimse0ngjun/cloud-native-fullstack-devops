package mainrun;

import java.util.List;

import dao.DeptDAO;
import dto.DeptDTO;

public class SelectRun {

	public static void main(String[] args) {
		
		DeptDAO dao = new DeptDAO();
		
		List<DeptDTO> list = dao.select();
		
		System.out.println("===================== 부서 목록 조회 ========================");
		System.out.println("부서번호\t| 부서이름\t\t| 근무처");
		if (list.isEmpty()) {
			System.out.println("조회할 데이터가 없습니다.");
		} else {
			for (DeptDTO deptDTO : list) {
				System.out.println(deptDTO.getDeptno() + " \t" + deptDTO.getDname() + " \t" + deptDTO.getLoc());
			}
		}
		
		System.out.println("=========================================================");
		
		
	}

}
