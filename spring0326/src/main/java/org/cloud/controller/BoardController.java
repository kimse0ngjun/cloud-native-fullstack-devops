package org.cloud.controller;

import java.util.List;

import org.cloud.dto.BoardDto;
import org.cloud.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/board")
public class BoardController {

	
	@Autowired
	private BoardService boardService;
	
	@GetMapping
	public List<BoardDto> openBoardList() throws Exception {
		return boardService.boardList();
	}
	
	@PostMapping("/write")
	public ResponseEntity<String> boardWrite(@RequestBody BoardDto board) throws Exception {
		boardService.boardWrite(board);
		return ResponseEntity.ok("Insert Success");
	}
	
	@GetMapping("/detail/{boardId}")
	public BoardDto openBoardDetail(@PathVariable("boardId") int boardId) throws Exception  {
		return boardService.boardDetail(boardId);
	}
	
	@PutMapping("/update/{boardId}")
	public ResponseEntity<String> updateHitCount(@PathVariable("boardId") int boardId, @RequestBody BoardDto board) throws Exception {
		board.setBoardId(boardId);
		boardService.updateBoard(board);
		return ResponseEntity.ok("Update Success");
	}
	
	@DeleteMapping("/delete/{boardId}")
	public ResponseEntity<String> deleteBoard(@PathVariable("boardId") int boardId) throws Exception {
		boardService.deleteBoard(boardId);
		return ResponseEntity.ok("Delete Success!");
	}
	
	
	
} 
