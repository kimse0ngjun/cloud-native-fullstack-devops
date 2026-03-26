package org.cloud.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.cloud.dto.BoardDto;
import org.cloud.dto.Criteria;
import org.cloud.dto.PageResponse;
import org.cloud.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/board")
public class BoardApiController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/list")
	public ResponseEntity<?> getBoardList(Criteria cri) throws Exception {
		if (cri.getPageNum() <= 0) {
			cri.setPageNum(1);
		}
		if (cri.getAmount() <= 0) {
			cri.setAmount(10);
		}
		
		List<BoardDto> list = boardService.selectBoardListPaging(cri);
		int total = boardService.selectBoardTotalCount();
		
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("list", list);
		response.put("pageMaker", new PageResponse(cri, total));
		
		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/insert") //localhost:8080/board/insertBoard.do
	public ResponseEntity<String> insertBoard(BoardDto board, MultipartHttpServletRequest multipartHttpServletRequest, Principal principal) throws Exception {
		if (principal != null) {
	        board.setCreatorId(principal.getName()); 
	    }
		boardService.insertBoard(board, multipartHttpServletRequest);
		return ResponseEntity.ok("insert success");
	}
	
	@GetMapping("/detail/{boardId}")
	public ResponseEntity<BoardDto> openBoardDetail(@PathVariable("boardId") int boardId) throws Exception {
		BoardDto board = boardService.selectDetail(boardId);
		
		if (board != null) {
			return ResponseEntity.ok(board);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateBoard(BoardDto board, MultipartHttpServletRequest request, Criteria cri, Principal principal) throws Exception {
		BoardDto detailBoard = boardService.selectDetail(board.getBoardId());
		if (principal != null && detailBoard.getCreatorId().equals(principal.getName())) {
			boardService.updateBoard(board, request);
			return ResponseEntity.ok("update success");
		} else {
//			return ResponseEntity.status(403).body("update fail: unauthorized");
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body("auth_error");
		}
		
	}
	
	@DeleteMapping("/delete/{boardId}")
	public ResponseEntity<String> deleteBoard(@PathVariable("boardId") int boardId, Principal principal) throws Exception {
		BoardDto board = boardService.selectDetail(boardId);
		
		if (principal != null && board.getCreatorId().equals(principal.getName())) {
			boardService.deleteBoard(boardId);
			return ResponseEntity.ok("delete success");
		} else {
//			return ResponseEntity.status(403).body("delete fail");
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body("auth_error");
		}
		
		
	}
	@DeleteMapping("/deleteFile/{fileIdx}")
	public ResponseEntity<String> deleteFile(@PathVariable("fileIdx") int fileIdx) throws Exception {
		try {
			boardService.deleteFile(fileIdx);
			return ResponseEntity.ok("success");
		} catch (Exception e) {
//			return ResponseEntity.status(500).body("fail");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("fail");
		}
	}

}
