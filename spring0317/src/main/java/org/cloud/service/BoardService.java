package org.cloud.service;

import java.util.List;

import org.cloud.dto.BoardDto;
import org.cloud.dto.Criteria;
import org.cloud.dto.FileDto;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface BoardService {

	List<BoardDto> selectBoardList() throws Exception;
	void insertBoard(BoardDto board) throws Exception;
	BoardDto selectDetail(int boardId) throws Exception;
	void updateBoard(BoardDto board) throws Exception;
	void deleteBoard(int boardId) throws Exception;
	void deleteFile(int fileIdx) throws Exception;
	List<BoardDto> selectBoardListPaging(Criteria cri) throws Exception;
	int selectBoardTotalCount() throws Exception;
}
