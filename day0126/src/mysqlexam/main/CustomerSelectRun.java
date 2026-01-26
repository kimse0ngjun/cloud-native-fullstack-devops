package mysqlexam.main;

import java.util.List;

import mysqlexam.dao.CustomerDAO;
import mysqlexam.dto.CustomerDTO;
public class CustomerSelectRun {

	public static void main(String[] args) {

		CustomerDAO dao = new CustomerDAO();
		
		List<CustomerDTO> list = dao.select();
		
		if (list.isEmpty()) {
			System.out.println("고객 정보 데이터 조회 안됨");
		} else { 
			for (CustomerDTO customerDTO : list) {
				System.out.println(customerDTO.getCustId() + " " + customerDTO.getCustName() + " " + customerDTO.getCustAddress() + 
						" " + customerDTO.getCustCity() + " " + customerDTO.getCustState() + " " + customerDTO.getCustCountry()  +  " " + 
						customerDTO.getCustContact() + " " + customerDTO.getCustEmail());
			}
		}
	}

}
