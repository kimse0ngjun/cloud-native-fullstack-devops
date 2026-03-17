package org.cloud.controller;

import org.cloud.config.DatabaseConfig;
import org.cloud.dto.NoticeDTO;
import org.cloud.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;


@Controller
@RequestMapping("/notice") // localhost8080/notice
public class NoticeController {

	private final DatabaseConfig databaseConfig;
	
	@Autowired
	NoticeService noticeService;
	
	
	NoticeController(DatabaseConfig databaseConfig) {
		this.databaseConfig = databaseConfig;
	}

	@GetMapping
	public String openNoticeList(Model model) throws Exception {
		model.addAttribute("list", noticeService.noticeList());
		return "noticeList/noticeList";
	}
	
	@GetMapping("writeui")
	public String writeUI() {
		return "notice/writeUi";
	}
	
	@PostMapping("/write")
	public String noticeWrite(NoticeDTO notice) throws Exception {
		noticeService.writeNotice(notice);
		return "redirect:/notice";
	}
	
	@GetMapping("/{id}")
	public String noticeDetail(@PathVariable("id") int id, Model model) throws Exception {
		NoticeDTO notice = noticeService.noticeDetail(id);
		model.addAttribute("notice", notice);
		return "notice/detailNotice";
	}
	
	@PutMapping("/{id}")
	public String noticeUpdate(@PathVariable("id") int id, NoticeDTO notice) throws Exception {
		notice.setId(id);
		noticeService.updateNotice(notice);
		return "redirect:/notice/" + id;
	}
	
	@DeleteMapping("/{id}")
	public String noticeDelete(@PathVariable("id") int id) throws Exception {
		noticeService.deleteNotice(id);
		return "redirect:/notice";
	}
}
