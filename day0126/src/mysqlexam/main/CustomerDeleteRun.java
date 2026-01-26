package mysqlexam.main;

import mysqlexam.dao.CustomerDAO;
import mysqlexam.dto.CustomerDTO;

public class CustomerDeleteRun {

	public static void main(String[] args) {
		
		CustomerDTO dto = new CustomerDTO();
		
		dto.setCustId("1000000008");
		
		CustomerDAO dao = new CustomerDAO();
		
		int result = dao.delete(dto);
		
		if (result > 0) {
			System.out.println("데이터 삭제 완료" + result);
		} else {
			System.out.println("데이터 삭제 실패");
		}

	}

}
