package org.cloud.order.main;

import java.util.List;

import org.cloud.order.dao.OrdersDao;
import org.cloud.order.dto.OrdersDto;


public class OrdersSelectRun {

	public static void main(String[] args) {

		OrdersDao dao = new OrdersDao();
		
		List<OrdersDto> list = dao.select();
		
		System.out.println("============= [ 주문 정보 조회 ] =============");
		if (list.isEmpty()) {
			System.out.println("주문이 없습니다.");
		} else {
			System.out.println("주문번호\t 주문날짜\t\t\t 고객번호\t");
			for (OrdersDto ordersDto : list) {
				System.out.println(ordersDto.getOrderNum() + "\t" + ordersDto.getOrderDate() + "\t" + ordersDto.getCustId());
			}
		}
		
	}

}
