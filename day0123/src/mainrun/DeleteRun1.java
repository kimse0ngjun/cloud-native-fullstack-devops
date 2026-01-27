package mainrun;

import dao.EmpDAO;

public class DeleteRun1 {

	public static void main(String[] args) {
		
		EmpDAO dao = new EmpDAO();
		
		int empno = 7368;
		
		int result = dao.delete(empno);
		
		if (result > 0) {
			System.out.println("삭제 완료.");
		} else {
			System.out.println("삭제 실패");
		}

	}

}
