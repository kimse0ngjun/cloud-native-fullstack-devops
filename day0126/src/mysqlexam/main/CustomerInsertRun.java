package mysqlexam.main;

import mysqlexam.dao.CustomerDAO;
import mysqlexam.dto.CustomerDTO;

public class CustomerInsertRun {

	public static void main(String[] args) {
		
		CustomerDTO dto = new CustomerDTO();
		
		dto.setCustId("1000000008");
		dto.setCustName("Kim Seong Jun");
		dto.setCustAddress("Busan");
		dto.setCustCity("Namgu");
		dto.setCustState("IN");
		dto.setCustZip("42413");
		dto.setCustCountry("KOREA");
		dto.setCustContact("ggwp");
		dto.setCustEmail("tjdwns8083@gmail.com");
		
		CustomerDAO dao = new CustomerDAO();
		int result = dao.insert(dto);
		
		if (result > 0) {
			System.out.println("고객 정보 삽입 성공~ " + dto.getCustName());
		} else {
			System.out.println("고객 정보 삽입 실패.");
		}

	}

}
