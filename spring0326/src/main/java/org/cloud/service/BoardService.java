package org.cloud.service;

import java.util.List;

import org.cloud.dto.BoardDto;

public interface BoardService {

	List<BoardDto> boardList() throws Exception;
	void boardWrite(BoardDto board) throws Exception;
	BoardDto boardDetail(int boardId) throws Exception;
	void updateHitCount(int boardId) throws Exception;
	void updateBoard(BoardDto board) throws Exception;
	void deleteBoard(int boardId) throws Exception;
}
