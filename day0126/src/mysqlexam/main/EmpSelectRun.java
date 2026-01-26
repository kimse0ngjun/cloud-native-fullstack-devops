package mysqlexam.main;

import java.util.List;
import java.util.Scanner;

import mysqlexam.dao.EmpDAO;
import mysqlexam.dto.EmpDTO;

public class EmpSelectRun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EmpDAO dao = new EmpDAO();
		
//		List<EmpDTO> list1 = dao.search();
//		List<EmpDTO> list2 = dao.search2();
		
		System.out.println("=============== 사원 정보 찾기 =======================");
		System.out.println("1. 이름검색 | 2. 직무검색");
		System.out.println("==============================================");
		System.out.print("선택 > ");
		
		int menuNum = Integer.parseInt(sc.nextLine());
		
		String ename = "", job = "";
		
		if (menuNum == 1) {
			System.out.print("검색할 이름 입력 : ");
			ename = sc.nextLine();
		} else if (menuNum == 2) {
			System.out.print("검색할 직무 입력 : ");
			job = sc.nextLine();
		} else {
			System.out.println("메뉴에 있는 번호를 선택하세요.");
		}
		
		List<EmpDTO> searchList = dao.search3(ename, job);
		System.out.println("===== [검색할 상세 정보] =====");
		
		if (searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (EmpDTO empDTO : searchList) {
				System.out.println(empDTO.getEname());
			}
		}
		
		
		
		//		System.out.print("직업 이름을 적어주세요 : ");
//		String sel2 = sc.nextLine();
		
//		if (sel.equals("이름")) {
//			for (EmpDTO empDTO : list1) {
//				System.out.println("이름 : " + empDTO.getEname());
//			}
//		} else if (sel.equals("직업")) {
//			for (EmpDTO empDTO : list2) {
//				System.out.println("직업 : " + empDTO.getJob());
//			}
//		} else {
//			System.out.println("이름 및 직업 조회가 안됩니다.");
//		}
	}

}
