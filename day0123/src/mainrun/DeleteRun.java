package mainrun;

import dao.DeptDAO;

public class DeleteRun {

	public static void main(String[] args) {

		DeptDAO dao = new DeptDAO();
		
		int deptno = 50;
		int result = dao.delete(deptno);
		
		if (result > 0) {
			System.out.println("데이터가 삭제되었습니다 : " + result);
		} else {
			System.out.println("데이터 삭제 실패");
		}
	}

}
