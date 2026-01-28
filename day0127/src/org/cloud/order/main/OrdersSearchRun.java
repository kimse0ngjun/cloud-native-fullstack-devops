package org.cloud.order.main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.cloud.order.dao.OrdersDao;
import org.cloud.order.dto.OrdersDto;

public class OrdersSearchRun {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		OrdersDao dao = new OrdersDao();
		
		System.out.println("============== 검색 =============");
		System.out.print("숫자 입력 - 1) 주문번호 2) 주문날짜 > ");
		int menuNum = Integer.parseInt(sc.nextLine());
		OrdersDto dto = new OrdersDto();
		
		switch (menuNum) {
		case 1:
			System.out.print("주문번호 입력 : ");
			dto.setOrderNum(Integer.parseInt(sc.nextLine()));
			break;
		case 2:
			System.out.print("주문날짜 입력 : ");
			String input = sc.nextLine();
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			dto.setOrderDate(LocalDateTime.parse(input, fmt));
			break;
		default:
			System.out.println("1,2번중에 선택 부탁");
			break;
		}
		
		List<OrdersDto> list = dao.search(dto);
		
		if (list.isEmpty()) {
			System.out.println("비었음");
		} else {
			for (OrdersDto ordersDto : list) {
				System.out.println(ordersDto.getOrderNum() + " | " + ordersDto.getOrderDate());
			}
		}
			
			System.out.println("===========================");
	}
}
