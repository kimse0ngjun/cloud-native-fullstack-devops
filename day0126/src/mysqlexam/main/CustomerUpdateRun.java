package mysqlexam.main;

import mysqlexam.dao.CustomerDAO;
import mysqlexam.dto.CustomerDTO;

public class CustomerUpdateRun {

	public static void main(String[] args) {
		
		CustomerDTO dto = new CustomerDTO();
		
		dto.setCustId("1000000008");
		dto.setCustName("Seong");
		dto.setCustCountry("SEOUL");
		
		CustomerDAO dao = new CustomerDAO();
		
		int result = dao.update(dto);
		
		if (result > 0) {
			System.out.println("고객 정보 수정 성공 ~ " + dto.getCustName() );
		} else {
			System.out.println("고객 정보 수정 실패");
		}

	}

}
