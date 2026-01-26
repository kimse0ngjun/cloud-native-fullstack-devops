package mysqlexam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import mysqlexam.db.EmpDBUtil;
import mysqlexam.dto.EmpDTO;

public class EmpDAO {
	
	public List<EmpDTO> select() {
		
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM emp;";
		
		try {
			conn = EmpDBUtil.getConnection();
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getString("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setCom(rs.getInt("com"));
				dto.setDeptno(rs.getInt("deptno"));
				
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
	
	public List<EmpDTO> search() {
		
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String query = "SELECT ename FROM emp;";
		
		try {
			conn = EmpDBUtil.getConnection();
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEname(rs.getString("ename"));
				
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
	
	public List<EmpDTO> search2() {
		
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String query = "SELECT job FROM emp;";
		
		try {
			conn = EmpDBUtil.getConnection();
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setJob(rs.getString("job"));
				
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
	
	public List<EmpDTO> search3(String ename, String job) {
		
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM emp WHERE ename LIKE ? OR job LIKE ?";
		
		try {
			conn = EmpDBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, ename.isEmpty() ? "NONE MATCH" : "%" + ename + "%");
			pstmt.setString(2, job.isEmpty() ? "NONE MATCH" : "%" + job + "%");
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getString("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setCom(rs.getInt("com"));
				dto.setDeptno(rs.getInt("deptno"));
				
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
}
