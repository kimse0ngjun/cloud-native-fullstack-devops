package org.cloud.order.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.cloud.order.db.DBUtil;
import org.cloud.order.dto.OrdersDto;

public class OrdersDao {

	
	public List<OrdersDto> select() {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		List<OrdersDto> list = new ArrayList<OrdersDto>();
		
		String query = "SELECT * FROM orders;";
		
		try {
			conn = DBUtil.getConnection();
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				OrdersDto dto = new OrdersDto();
				dto.setOrderNum(rs.getInt("order_num"));
//				Timestamp ts = rs.getTimestamp("order_date");
//				dto.setOrderDate(ts.toLocalDateTime());
				dto.setOrderDate(rs.getTimestamp("order_date").toLocalDateTime()); // mysql 날짜처리방식
				dto.setCustId(rs.getString("cust_id"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstm != null) pstm.close();
				if (conn != null) conn.close();
					
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
	
	public int insert(OrdersDto dto) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		String query = "INSERT INTO ORDERS(order_num, order_date, cust_id) VALUES (?,?,?);";
		
		try {
			conn = DBUtil.getConnection();
			pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, dto.getOrderNum());
			pstm.setTimestamp(2, Timestamp.valueOf(dto.getOrderDate()));
			pstm.setString(3, dto.getCustId());
	
			return pstm.executeUpdate(); // 입력되어 처리된 행의 값 리턴(Int)
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstm != null) pstm.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return 0; 
	}
	
	public int update(OrdersDto dto) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		String query = "UPDATE orders SET order_date = ?, cust_id = ? where order_num = ?";
		
		try {
			conn = DBUtil.getConnection();
			pstm = conn.prepareStatement(query);
			
			pstm.setTimestamp(1, Timestamp.valueOf(dto.getOrderDate()));
			pstm.setString(2, dto.getCustId());
			pstm.setInt(3, dto.getOrderNum());
	
			return pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstm != null) pstm.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return 0; 
	}
	
	public int delete(OrdersDto dto) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		String query = "DELETE FROM orders where order_num = ?";
		
		try {
			conn = DBUtil.getConnection();
			pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, dto.getOrderNum());
	
			return pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstm != null) pstm.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return 0; 
	}
	
}
