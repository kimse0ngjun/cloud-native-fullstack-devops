package cloud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cloud.dto.LocalDTO;

public class LocalDAO {

	
	public List<LocalDTO> list() {
		
		List<LocalDTO> list = new ArrayList<LocalDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM request";
		
		return list;
	}
}
