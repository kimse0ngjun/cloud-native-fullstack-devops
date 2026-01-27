package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dbutil.DBUtil;
import dto.EmpDTO;

public class EmpDAO {
	

	public List<EmpDTO> select() {
		
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM emp";
		
		try {
			conn = DBUtil.getConnection();
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery(query);
			
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
				if (rs != null) {
					rs.close();
				} 
				
				if (pstm != null) {
					pstm.close();	
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
	
	public int insert(EmpDTO dto) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		int rs = 0;
		
		String query = "INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, com, deptno) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			conn = DBUtil.getConnection();
			pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, dto.getEmpno());
			pstm.setString(2, dto.getEname());
			pstm.setString(3, dto.getJob());
			pstm.setInt(4, dto.getMgr());
			pstm.setString(5, dto.getHiredate());
			pstm.setInt(6, dto.getSal());
			pstm.setInt(7, dto.getCom());
			pstm.setInt(8, dto.getDeptno());
		
			rs = pstm.executeUpdate();
			
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
	
	public int update(EmpDTO dto) {
		Connection conn = null;
		PreparedStatement pstm = null;
		
		int result = 0;
		
		String query = "UPDATE emp SET ename = ?, job = ?, sal = ?, com = ? where empno = ?";
		
		try {
			conn = DBUtil.getConnection();
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, dto.getEname());
			pstm.setString(2, dto.getJob());
			pstm.setInt(3, dto.getSal());
			pstm.setInt(4, dto.getCom());
			pstm.setInt(5, dto.getEmpno());
			
			
			result = pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if (pstm != null) {
					pstm.close();
				}
				
				if (conn != null) {
					conn.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return result;
	}
	
	public int delete(int empno) { // public int delete(EmpDTO dto) {
		Connection conn = null;
		PreparedStatement pstm = null;
		
		String query = "DELETE FROM emp where empno = ?";
		
		int result = 0;
		
		try {
			conn = DBUtil.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, empno);
			// pstm.setInt(1, dto.getEmpno());
			
			
			result = pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return result;
	}

}
