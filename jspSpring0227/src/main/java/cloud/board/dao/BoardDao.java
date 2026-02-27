package cloud.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import cloud.board.dto.BoardDto;
import cloud.board.utils.DBUtils;

public class BoardDao {

	public ArrayList<BoardDto> list() {

		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String query = "SELECT num, author, title, content, date_format(writeday, '%Y.%m.%d') as writeday, readCnt, repRoot, repStep, repIndent FROM board ORDER BY repRoot DESC, repStep ASC";

		try {
			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				BoardDto data = new BoardDto();
				data.setNum(rs.getInt("num"));
				data.setAuthor(rs.getString("author"));
				data.setTitle(rs.getString("title"));
				data.setContent(rs.getString("content"));
				data.setWriteday(rs.getString("writeday"));
				data.setReadCnt(rs.getInt("readCnt"));
				data.setRepRoot(rs.getInt("repRoot"));
				data.setRepStep(rs.getInt("repStep"));
				data.setRepIndent(rs.getInt("repIndent"));

				list.add(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return list;
	}
	
	public void write(String _title, String _author, String _content) {
	      
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      int currval = 0;
	      
	      String sql = "SELECT ifnull(max(num), 0) + 1 FROM board";
	      
	      try {
	         conn = DBUtils.getConnection();
	         pstmt = conn.prepareStatement(sql);
	         rs = pstmt.executeQuery();
	         if (rs.next()) {
	            currval = rs.getInt(1);
	         }
	         
	         String query = "INSERT INTO board(title, author, content, repRoot, repStep, repIndent) VALUES(?, ?, ?, '"+currval+"', 0, 0)";
	         pstmt = conn.prepareStatement(query);
	         pstmt.setString(1, _title);
	         pstmt.setString(2, _author);
	         pstmt.setString(3, _content);
	         
	         int n = pstmt.executeUpdate();
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if(rs != null) rs.close();
	            if(pstmt != null) pstmt.close();
	            if(conn != null) conn.close();
	         } catch (Exception e2) {
	            // TODO: handle exception
	            e2.printStackTrace();
	         }
	      }
	   }
	public void readCount(String _num) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String query = "UPDATE board SET readCnt = readCnt + 1 WHERE num = " + _num;
		
		try {
			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.executeUpdate();
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
	
	public BoardDto retrieve(String _num) {
		
		readCount(_num);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardDto data = new BoardDto();
		
		String query = "SELECT * FROM board WHERE num=?";
		
		try {
			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(_num));
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				data.setNum(rs.getInt("num"));
				data.setTitle(rs.getString("title"));
				data.setAuthor(rs.getString("author"));
				data.setContent(rs.getString("content"));
				data.setWriteday(rs.getString("writeday"));
				data.setReadCnt(rs.getInt("readCnt"));
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
	
	public void update(String _num, String _title, String _author, String _content) {
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String query = "UPDATE board SET title = ?, author = ?, content = ? WHERE num = ?";
		
		try {
			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, _title);
			pstmt.setString(2, _author);
			pstmt.setString(3, _content);
			pstmt.setInt(4, Integer.parseInt(_num));
			
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
	
	public void delete(String _num) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String query = "DELETE FROM board WHERE num = ?";
		
		try {
			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(_num));
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
	
	public ArrayList<BoardDto> search(String _searchName, String _searchValue) {
		
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "SELECT num, author, title, content, date_format(writeday, '%Y,%m,%d') as writeday, readCnt FROM board";
		
		try {
			conn = DBUtils.getConnection();
			
			if (_searchName.equals("title")) {
				query+=" WHERE title LIKE ?"; // 띄어쓰기 해야함
			} else {
				query+=" WHERE author LIKE ?";
			}
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%"+_searchValue+"%");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				BoardDto data = new BoardDto();
				data.setNum(rs.getInt("num"));
				data.setAuthor(rs.getString("author"));
				data.setTitle(rs.getString("title"));
				data.setContent(rs.getString("content"));
				data.setWriteday(rs.getString("writeday"));
				data.setReadCnt(rs.getInt("readCnt"));
				
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