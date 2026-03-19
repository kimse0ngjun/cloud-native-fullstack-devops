package org.cloud.controller;

import org.cloud.config.DatabaseConfig;
import org.cloud.dto.MemberInfoDTO;
import org.cloud.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	public String openMemberList(Model model) throws Exception {
		model.addAttribute("list", memberService.memberList());
		return "memberList";
	}
	
	@PostMapping("/write")
	public String memberWrite(MemberInfoDTO member) throws Exception {
		memberService.writeMember(member);
		return "redirect:/member/list";
	}
	
	@GetMapping("/detail")
	public String memberDetail(@RequestParam("id") String id, Model model) throws Exception {
		MemberInfoDTO member = memberService.memberDetail(id);
		model.addAttribute("member", member);
		return "detailMember";
	}

	@PostMapping("/update")
	public String memberUpdate(MemberInfoDTO member) throws Exception {
		memberService.updateMember(member);
		return "redirect:/member/list";
	}
	
	@PostMapping("/delete")
	public String memberDelete(@RequestParam("id") String id) throws Exception {
		memberService.deleteMember(id);
		return "redirect:/member/list";
	}
}
