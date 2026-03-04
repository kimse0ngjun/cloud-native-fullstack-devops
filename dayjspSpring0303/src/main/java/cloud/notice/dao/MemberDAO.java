package cloud.notice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cloud.notice.dto.MemberDTO;
import cloud.notice.utils.DBUtils;

public class MemberDAO {
	
	public void insertMember(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtils.getConnection();
			String query = "INSERT INTO member(user_id, user_pwd, user_name) VALUES (?,?,?)";
			pstmt = conn.prepareStatement(query);
            pstmt.setString(1, dto.getUserId());
            pstmt.setString(2, dto.getUserPwd());
            pstmt.setString(3, dto.getUserName());
            pstmt.executeUpdate();
			return;
			
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
	}
	
	public MemberDTO loginCheck(String _id, String _pwd) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDTO member = null;
		
		String query = "SELECT * FROM member WHERE user_id = ? AND user_pwd = ?";
		
		try {
			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, _id);
			pstmt.setString(2, _pwd);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				member = new MemberDTO();
				member.setUserId(rs.getString("user_id"));
				member.setUserPwd(rs.getString("user_pwd"));
				member.setUserName(rs.getString("user_name"));
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
		
		return member;
	}
	
	public boolean idExists(String id) {
		String sql = "SELECT COUNT(*) FROM member WHERE user_id = ?";
		
		try (Connection conn = DBUtils.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			pstmt.setString(1, id);
			
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					return rs.getInt(1) > 0;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
