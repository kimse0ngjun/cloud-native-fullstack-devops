package org.cloud.order.dto;

import java.time.LocalDateTime;

public class OrdersDto {
	
	private int orderNum;
	private LocalDateTime orderDate;
	private String custId;
	
	public int getOrderNum() {
		return orderNum;
	}
	
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

}
