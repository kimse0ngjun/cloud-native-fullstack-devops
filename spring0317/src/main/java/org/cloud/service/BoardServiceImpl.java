package org.cloud.service;

import java.util.List;

import org.cloud.dto.BoardDto;
import org.cloud.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardDto> selectBoardList() throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.selectBoardList();
	}
	
	@Override
	public void insertBoard(BoardDto board) throws Exception {
		// TODO Auto-generated method stub
		boardMapper.insertBoard(board);
	}
	
	@Override
	public BoardDto selectDetail(int boardId) throws Exception {
		// TODO Auto-generated method stub
		boardMapper.updateHitCount(boardId);
		return boardMapper.selectDetail(boardId);
	}
	
	@Override
	public void updateBoard(BoardDto board) throws Exception {
		// TODO Auto-generated method stub
		boardMapper.updateBoard(board);
	}
	
	@Override
	public void deleteBoard(int boardId) throws Exception {
		// TODO Auto-generated method stub
		boardMapper.deleteBoard(boardId);
	}
}
