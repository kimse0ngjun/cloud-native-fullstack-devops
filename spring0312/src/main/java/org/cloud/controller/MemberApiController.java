package org.cloud.controller;

import org.cloud.dto.MemberDto;
import org.cloud.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/member")
public class MemberApiController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping
	public String main() {
		return "/";
	}
	
	@GetMapping("/login")
	public ResponseEntity<String> loginPage() {
		return ResponseEntity.ok("success!");
	}
	
	@GetMapping("/join")
	public ResponseEntity<String> openJoin() {
		return ResponseEntity.ok("success!");
	}
	
	@PostMapping("/insertMember")
	public ResponseEntity<String> insertMember(MemberDto member) throws Exception {
		memberService.insertMember(member);
		return ResponseEntity.ok("insertMember Success");
	}
}
