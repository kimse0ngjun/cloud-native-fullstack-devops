package org.cloud.controller;

import java.util.List;

import org.cloud.config.DatabaseConfig;
import org.cloud.dto.MemberInfoDTO;
import org.cloud.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/member")
public class MemberApiController {

	@Autowired
	MemberService memberService;
	
	@GetMapping("/list")	
	public List<MemberInfoDTO> openMemberList() throws Exception {
		return memberService.memberList();
	}
	
	@PostMapping("/write")
	public ResponseEntity<String> memberWrite(@RequestBody MemberInfoDTO member) throws Exception {
		memberService.writeMember(member);
		return ResponseEntity.ok("success");
	}
	
	@GetMapping("/detail/{id}")
	public ResponseEntity<MemberInfoDTO> memberDetail(@PathVariable("id") String id, Model model) throws Exception {
		MemberInfoDTO member = memberService.memberDetail(id);
		return ResponseEntity.ok(member);
	}

	@PutMapping("/update")
	public ResponseEntity<String> memberUpdate(@RequestBody MemberInfoDTO member) throws Exception {
		memberService.updateMember(member);
		return ResponseEntity.ok("success");
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> memberDelete(@PathVariable("id") String id) throws Exception {
		memberService.deleteMember(id);
		return ResponseEntity.ok("success");
	}
}
