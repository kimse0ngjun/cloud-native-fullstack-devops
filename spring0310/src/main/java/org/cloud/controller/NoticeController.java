package org.cloud.controller;

import org.cloud.config.DatabaseConfig;
import org.cloud.dto.NoticeDTO;
import org.cloud.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;


@Controller
@RequestMapping("/") // localhost8080/notice
public class NoticeController {

	private final DatabaseConfig databaseConfig;
	
	@Autowired
	NoticeService noticeService;
	
	
	NoticeController(DatabaseConfig databaseConfig) {
		this.databaseConfig = databaseConfig;
	}

	@GetMapping("/notice/list")
	public String openNoticeList(Model model) throws Exception {
		model.addAttribute("list", noticeService.noticeList());
		return "noticeList";
	}
	
	@GetMapping("/notice/writeui")
	public String writeUI() {
		return "writeUi";
	}
	
	@PostMapping("/notice/write")
	public String noticeWrite(NoticeDTO notice) throws Exception {
		noticeService.writeNotice(notice);
		return "redirect:/notice/list";
	}
	
	@GetMapping("/notice/detail")
	public String noticeDetail(@RequestParam("id") int id, Model model) throws Exception {
		NoticeDTO notice = noticeService.noticeDetail(id);
		model.addAttribute("notice", notice);
		return "detailNotice";
	}
	
	@PostMapping("/notice/update")
	public String noticeUpdate(NoticeDTO notice) throws Exception {
		noticeService.updateNotice(notice);
		return "redirect:/notice/list";
	}
	
	@PostMapping("/notice/delete")
	public String noticeDelete(@RequestParam("id") int id) throws Exception {
		noticeService.deleteNotice(id);
		return "redirect:/notice/list";
	}
}
