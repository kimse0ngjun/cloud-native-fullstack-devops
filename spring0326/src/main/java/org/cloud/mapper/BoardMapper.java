package org.cloud.mapper;

import java.util.List;

import org.cloud.dto.BoardDto;

public interface BoardMapper {

	List<BoardDto> boardList() throws Exception;
	void boardWrite(BoardDto board) throws Exception;
	BoardDto boardDetail(int boardId) throws Exception;
	void updateHitCount(int board) throws Exception;
	void updateBoard(BoardDto boardId) throws Exception;
	void deleteBoard(int boardId) throws Exception;
}
