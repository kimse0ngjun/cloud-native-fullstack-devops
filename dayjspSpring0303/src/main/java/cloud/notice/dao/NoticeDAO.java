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

	public List<NoticeDTO> list(int start, int count) {
		List<NoticeDTO> list = new ArrayList<NoticeDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM notice ORDER BY id DESC LIMIT ?, ?";
		
		try {
			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, start);
			pstmt.setInt(2, count);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				NoticeDTO data = new NoticeDTO();
				data.setId(rs.getInt("id"));
				data.setTitle(rs.getString("title"));
				data.setContent(rs.getString("content"));
				data.setWriter(rs.getString("writer"));
				data.setRegDate(rs.getString("reg_date"));
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
		
		try {
			conn = DBUtils.getConnection();
			String query = "INSERT INTO notice(title, content, writer, reg_date, hit) VALUES(?, ?, ?, now(), 0)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, _title);
			pstmt.setString(2, _content);
			pstmt.setString(3, _writer);
			
			int result = pstmt.executeUpdate();
			System.out.println(result);
			
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
	
	public void readCount(String _id) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String query = "UPDATE notice set hit = hit + 1 WHERE id = " + _id;
		
		try {
			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(query);
			
			int n = pstmt.executeUpdate();
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
	
	public NoticeDTO retrieve(String _id) {
		
		readCount(_id);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		NoticeDTO data = new NoticeDTO();
		
		String query = "SELECT * FROM notice WHERE id=?";
		
		try {
			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(_id));
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				data.setId(rs.getInt("id"));
				data.setTitle(rs.getString("title"));
				data.setContent(rs.getString("content"));
				data.setWriter(rs.getString("writer"));
				data.setRegDate(rs.getString("reg_date"));
				data.setHit(rs.getInt("hit"));
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
		
		return data;
	}
	
	public ArrayList<NoticeDTO> search(String _searchName, String _searchValue){
		
		ArrayList<NoticeDTO> list = new ArrayList<NoticeDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "SELECT id, title, content, writer, date_format(reg_date, '%Y.%m.%d') as reg_date, hit FROM notice";
		
		try {
			conn = DBUtils.getConnection();
			
			if (_searchName.equals("title")) {
				query+=" WHERE title LIKE ?";
			} else {
				query+=" WHERE writer LIKE ?";
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
				data.setRegDate(rs.getString("reg_date"));
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
	
	public void update(String _id, String _title, String _writer, String _content) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String query = "UPDATE notice SET title=?, writer=?, content=? WHERE id=?";
		
		try {
			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, _title);
			pstmt.setString(2, _writer);
			pstmt.setString(3, _content);
			pstmt.setInt(4, Integer.parseInt(_id));
			
			int n = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	public void delete(String _id) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String query = "DELETE FROM notice WHERE id = ?";
		
		try {
			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(_id));
			int n = pstmt.executeUpdate();
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
	}
	
	public int getTotalCount() {
		int count = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "SELECT COUNT(*) FROM notice";
		
		try {
			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				count = rs.getInt(1);
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
		
		return count;
	}
}
