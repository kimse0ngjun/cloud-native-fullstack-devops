package org.cloud.controller;

import java.util.List;

import org.cloud.dto.BoardDto;
import org.cloud.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@GetMapping  //localhost:8080/board/
	public String openBoardList(Model model) throws Exception {
		List<BoardDto> list = boardService.selectBoardList();
		model.addAttribute("list", list);
		return "board/boardList";
	}
	
	@GetMapping("/write")
	public String openBoardWrite() {
		return "board/boardWrite";
	}
	
	@PostMapping
	public String insertBoard(BoardDto board) throws Exception {
		boardService.insertBoard(board);
		return "redirect:/board";
	}
	
	@GetMapping("/{boardId}") //localhost:8080/board/10
	public String openBoardDetail(@PathVariable("boardId") int boardId, Model model) throws Exception {
		BoardDto board = boardService.selectDetail(boardId);
		model.addAttribute("board", board);
		return "board/boardDetail";
	}
	
	@PutMapping("/{boardId}")
	public String updateBoard(@PathVariable("boardId") int boardId, BoardDto board) throws Exception {
		board.setBoardId(boardId);
		boardService.updateBoard(board);
		return "redirect:/board";
	}
	
	@DeleteMapping("/{boardId}")
	public String deleteBoard(@PathVariable("boardId") int boardId) throws Exception {
		boardService.deleteBoard(boardId);
		return "redirect:/board";
	}
}






