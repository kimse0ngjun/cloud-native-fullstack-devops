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
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return list;
	}

}
