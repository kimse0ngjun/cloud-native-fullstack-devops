package org.cloud.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import org.cloud.dto.MemberDto;
import org.cloud.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/member")
public class MemberApiController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/login")
	public ResponseEntity<String> loginPage() {
		return ResponseEntity.ok("success!");
	}
	
	@GetMapping("/join")
	public ResponseEntity<Map<String, Object>> insertMember(@RequestBody MemberDto member) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		try {
			memberService.insertMember(member);
			resultMap.put("status", "success");
			resultMap.put("message", "회원가입이 완료되었습니다.");
			resultMap.put("userId", member.getUserId());
			
			return ResponseEntity.status(HttpStatus.CREATED).body(resultMap);
		} catch (Exception e) {
			resultMap.put("status", "error");
			resultMap.put("message", "회원가입 실패: " + e.getMessage());
			
			return ResponseEntity.badRequest().body(resultMap);
		} 
	}
	
	@GetMapping("/status")
	public ResponseEntity<Map<String, Object>> getLoginStatus(Principal principal) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		if (principal != null) {
			resultMap.put("isLogin", true);
			resultMap.put("userId", principal.getName());
			
			return ResponseEntity.ok(resultMap);
		} else {
			resultMap.put("isLogin", false);
			resultMap.put("userId", null);
			
			return ResponseEntity.ok(resultMap);
		}
	}
}
