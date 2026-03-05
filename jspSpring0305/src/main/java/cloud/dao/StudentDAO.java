package cloud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cloud.dto.StudentDTO;
import cloud.utils.DBUtils;

public class StudentDAO {
	
	public ArrayList<StudentDTO> list() {
		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM student";
		
		try {
			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				StudentDTO dto = new StudentDTO();
				dto.setId(rs.getInt("id"));
				dto.setUsername(rs.getString("username"));
				dto.setUniv(rs.getString("univ"));
				dto.setBirth(rs.getString("birth"));
				dto.setEmail(rs.getString("email"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}

	public void insert(String username, String univ, String birth, String email) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String query = "INSERT INTO student(username, univ, birth, email) VALUES (?,?,?,?)";
		
		try {
			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, univ);
			pstmt.setString(3, birth);
			pstmt.setString(4, email);
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
