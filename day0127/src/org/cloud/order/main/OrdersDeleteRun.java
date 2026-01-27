package org.cloud.order.main;


import org.cloud.order.dao.OrdersDao;
import org.cloud.order.dto.OrdersDto;

public class OrdersDeleteRun {

	public static void main(String[] args) {
		
		OrdersDto dto = new OrdersDto();
		
		dto.setOrderNum(20011);

		OrdersDao dao = new OrdersDao();
		int result = dao.delete(dto);
		
		if (result > 0) {
			System.out.println("주문 삭제 완료" + result);
		} else {
			System.out.println("주문 삭제 실패");
		}
	}

}
