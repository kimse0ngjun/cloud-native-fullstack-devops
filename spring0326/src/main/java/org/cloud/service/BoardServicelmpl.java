package org.cloud.service;

import java.util.List;

import org.cloud.dto.BoardDto;
import org.cloud.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServicelmpl implements BoardService { 

	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardDto> boardList() throws Exception {
		return boardMapper.boardList();
	}
	
	@Override
	public void boardWrite(BoardDto board) throws Exception {
		boardMapper.boardWrite(board);
	}
	
	@Override
	public BoardDto boardDetail(int boardId) throws Exception{
		boardMapper.updateHitCount(boardId);
		return boardMapper.boardDetail(boardId);
	}
	
	@Override
	public void updateBoard(BoardDto board) throws Exception {
		boardMapper.updateBoard(board);
	}
	
	@Override
	public void deleteBoard(int boardId) throws Exception {
		boardMapper.deleteBoard(boardId);
	}
	
	@Override
	public void updateHitCount(int boardId) throws Exception {
		boardMapper.boardDetail(boardId);
	}
}
