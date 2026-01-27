package org.cloud.order.main;

import java.time.LocalDateTime;

import org.cloud.order.dao.OrdersDao;
import org.cloud.order.dto.OrdersDto;

public class OrdersUpdateRun {

	public static void main(String[] args) {

		
		OrdersDto dto = new OrdersDto();
		dto.setOrderNum(20011);
		dto.setOrderDate(LocalDateTime.now());
		dto.setCustId("1000000002");
		
		OrdersDao dao = new OrdersDao();
		int result = dao.update(dto);
		
		if (result > 0) {
			System.out.println("주문 수정되었습니다." + dto.getOrderNum() + " | " + dto.getOrderDate() +  " | " + dto.getCustId());
		} else {
			System.out.println("주문 수정 실패");
		}
	}

}
