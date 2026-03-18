package org.cloud.service;

import java.util.List;

import org.cloud.dto.BoardDto;

public interface BoardService {

	List<BoardDto> selectBoardList() throws Exception;
	void insertBoard(BoardDto board) throws Exception;
	BoardDto selectDetail(int boardId) throws Exception;
	void updateBoard(BoardDto board) throws Exception;
	void deleteBoard(int boardId) throws Exception;
}
