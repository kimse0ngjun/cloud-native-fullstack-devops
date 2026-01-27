package org.cloud.order.main;

import java.time.LocalDateTime;

import org.cloud.order.dao.OrdersDao;
import org.cloud.order.dto.OrdersDto;

public class OrdersInsertRun {

	public static void main(String[] args) {

		
		OrdersDto dto = new OrdersDto();
		dto.setOrderNum(20011);
		dto.setOrderDate(LocalDateTime.now());
		dto.setCustId("1000000002");
		
		
		OrdersDao dao = new OrdersDao(); 
		int result = dao.insert(dto);
		
		if (result > 0) {
			System.out.println("주문 추가 완료 : " + dto.getOrderNum());
		} else {
			System.out.println("주문 추가 실패 !");
		}
	}

}
