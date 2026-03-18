package org.cloud.mapper;

import java.util.List;

import org.cloud.dto.BoardDto;

public interface BoardMapper {

	List<BoardDto> selectBoardList() throws Exception;
	void insertBoard(BoardDto board) throws Exception;
	BoardDto selectDetail(int boardId) throws Exception;
	void updateHitCount(int boardId) throws Exception;
	void updateBoard(BoardDto board) throws Exception;
	void deleteBoard(int boardId) throws Exception;
}
