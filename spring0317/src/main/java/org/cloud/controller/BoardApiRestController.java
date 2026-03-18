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
@RequestMapping("/api/board") //localhost:8080/api/board
public class BoardApiRestController {

	@Autowired
	private BoardService boardService;
	
	@GetMapping
	public List<BoardDto> openBoardList() throws Exception {
		return boardService.selectBoardList();
	}
	
	@PostMapping("/write")
	public ResponseEntity<String> insertBoard(@RequestBody BoardDto board) throws Exception {
		try {
			boardService.insertBoard(board);
			return ResponseEntity.ok("success");
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body("Fail:" + e.getMessage());
		}
	}
	
	@GetMapping("/{boardId}")
	public BoardDto openBoardDetail(@PathVariable("boardId") int boardId) throws Exception {
		return boardService.selectDetail(boardId);
	}
	
	@PutMapping("/{boardId}")
	public ResponseEntity<String> updateBoard(@PathVariable("boardId") int boardId, @RequestBody BoardDto board) throws Exception {
		board.setBoardId(boardId);
		boardService.updateBoard(board);
		return ResponseEntity.ok("success");
	}
	
	@DeleteMapping("/{boardId}")
	public ResponseEntity<String> deleteBoard(@PathVariable("boardId") int boardId) throws Exception{
		boardService.deleteBoard(boardId);
		return ResponseEntity.ok("success");
	}
}






