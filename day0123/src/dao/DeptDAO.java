package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbutil.DBUtil;
import dto.DeptDTO;

public class DeptDAO {

	public List<DeptDTO> select() {
		
		List<DeptDTO> list = new ArrayList<DeptDTO>();
		Connection conn = null; // DB 연결
		Statement stmt = null; // 쿼리 작성
		ResultSet rs = null; // 결과 처리
		
		
		String query = "SELECT deptno, dname, loc FROM dept";
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query); // select
			
			while (rs.next()) {
				DeptDTO dto = new DeptDTO();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				
				if (stmt != null) {
					stmt.close();
				}
				
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return list;
	}
	
	public int insert(DeptDTO dto) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String query = "INSERT INTO dept(deptno, dname, loc) VALUES (?, ?, ?)";
		
		int result = 0;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			// 순서대로 입력
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			
			result = pstmt.executeUpdate(); // 정상실행 1, 실패 0
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	public int update(DeptDTO dto) {
		
		Connection conn = null;
		PreparedStatement pstmt1 = null;
		
		String query = "UPDATE dept SET dname = ?, loc = ? WHERE deptno = ?";
		
		int result = 0;
		
		try {
			conn = DBUtil.getConnection();
			pstmt1 = conn.prepareStatement(query);
			
			// ? 순서에 맞게 값 입력
			pstmt1.setString(1, dto.getDname());
			pstmt1.setString(2, dto.getLoc());
			pstmt1.setInt(3, dto.getDeptno());
			
			result = pstmt1.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt1 != null) pstmt1.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	public int delete(int deptno) {
		
		Connection conn = null;
		PreparedStatement pstmt1 = null;
		
		String query = "DELETE FROM dept WHERE deptno = ?";
		
		int result = 0;
		
		try {
			conn = DBUtil.getConnection();
			pstmt1 = conn.prepareStatement(query);
			
			pstmt1.setInt(1, deptno);
			
			result = pstmt1.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt1 != null) pstmt1.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	
}
