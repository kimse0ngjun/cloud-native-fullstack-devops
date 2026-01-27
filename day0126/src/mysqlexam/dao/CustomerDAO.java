package mysqlexam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import mysqlexam.db.DBUtil;
import mysqlexam.dto.CustomerDTO;

public class CustomerDAO {
	
	public List<CustomerDTO> select() {
		
		List<CustomerDTO> list = new ArrayList<CustomerDTO>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM customers";
		
		try {
			conn = DBUtil.getConnection();
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				CustomerDTO dto = new CustomerDTO();
				dto.setCustId(rs.getString("cust_id")); // 컬럼명
				dto.setCustName(rs.getString("cust_name"));
				dto.setCustAddress(rs.getString("cust_address"));
				dto.setCustCity(rs.getString("cust_city"));
				dto.setCustState(rs.getString("cust_state"));
				dto.setCustZip(rs.getString("cust_zip"));
				dto.setCustCountry(rs.getString("cust_country"));
				dto.setCustContact(rs.getString("cust_contact"));
				dto.setCustEmail(rs.getString("cust_email"));
				
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
	
	public int insert(CustomerDTO dto) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		String query = "INSERT INTO customers(cust_id, cust_name, cust_address, cust_city, cust_state, cust_zip, cust_country, cust_contact, cust_email)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		int rs = 0;
		
		try {
			conn = DBUtil.getConnection();
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, dto.getCustId());
			pstm.setString(2, dto.getCustName());
			pstm.setString(3, dto.getCustAddress());
			pstm.setString(4, dto.getCustCity());
			pstm.setString(5, dto.getCustState());
			pstm.setString(6, dto.getCustZip());
			pstm.setString(7, dto.getCustCountry());
			pstm.setString(8, dto.getCustContact());
			pstm.setString(9, dto.getCustEmail());
		
			rs = pstm.executeUpdate(); // 1
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) pstm.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return rs;
	}
	
	public int update(CustomerDTO dto) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		String query = "UPDATE customers SET cust_name = ?, cust_country = ? WHERE cust_id = ?";
		
		int result = 0;
		
		try {
			conn = DBUtil.getConnection();
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, dto.getCustName());
			pstm.setString(2, dto.getCustCountry());
			pstm.setString(3, dto.getCustId());
			
			result = pstm.executeUpdate();
			
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
		return result;
	}
	
	public int delete(CustomerDTO dto) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		String query = "DELETE FROM customers where cust_id = ?";
		
		int result = 0;
		
		try {
			conn = DBUtil.getConnection();
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, dto.getCustId());
			
			result = pstm.executeUpdate();
			// return pstmt1.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) pstm.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return result;
		// return 0;
	}
	
	
}
