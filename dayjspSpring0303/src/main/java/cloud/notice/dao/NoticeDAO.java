package cloud.notice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.x.Notice;

import cloud.notice.dto.NoticeDTO;
import cloud.notice.utils.DBUtils;

public class NoticeDAO {

	public List<NoticeDTO> list() {
		List<NoticeDTO> list = new ArrayList<NoticeDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM notice";
		
		try {
			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				NoticeDTO data = new NoticeDTO();
				data.setId(rs.getInt("id"));
				data.setTitle(rs.getString("title"));
				data.setContent(rs.getString("content"));
				data.setWriter(rs.getString("writer"));
				data.setRegDate(rs.getString("regDate"));
				data.setHit(rs.getInt("hit"));
				
				list.add(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
			}
		}
		
		return list;
	}
	
	public void write(String _title, String _content, String _writer) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int currval = 0;
		
		try {
			conn = DBUtils.getConnection();
			String sql = "SELECT ifnull(max(num), 0) + 1 FROM notice";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				currval = rs.getInt(1);
			}
			
			String query = "INSERT INTO board(title, content, writer, repDate, hit) VALUES(?,?,?,'"+currval+"', ?)";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, _title);
			pstmt.setString(2, _writer);
			pstmt.setString(3, _content);
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
	
	public ArrayList<NoticeDTO> search(String _searchName, String _searchValue){
		
		ArrayList<NoticeDTO> list = new ArrayList<NoticeDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "SELECT id, title, content, writer, date_format(regDate, '%Y.%m.%d') as regDate, hit FROM notice";
		
		try {
			conn = DBUtils.getConnection();
			
			if (_searchName.equals("title")) {
				query+=" WHERE title LIKE ?";
			} else {
				query+=" WHERE wrtier LIKE ?";
			}
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%"+_searchValue+"%");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				NoticeDTO data = new NoticeDTO();
				data.setId(rs.getInt("id"));
				data.setTitle(rs.getString("title"));
				data.setContent(rs.getString("content"));
				data.setWriter(rs.getString("writer"));
				data.setRegDate(rs.getString("regDate"));
				data.setHit(rs.getInt("hit"));
				
				list.add(data);
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
