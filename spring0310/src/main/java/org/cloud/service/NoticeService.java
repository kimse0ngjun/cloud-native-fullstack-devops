package org.cloud.service;

import java.util.List;

import org.cloud.dto.NoticeDTO;

public interface NoticeService {

	List<NoticeDTO> noticeList() throws Exception;
	int writeNotice(NoticeDTO notice) throws Exception;
	NoticeDTO noticeDetail(int id) throws Exception;
	int updateNotice(NoticeDTO notice) throws Exception;
	NoticeDTO deleteNotice(int id) throws Exception;
	int updateHit(int id) throws Exception;
}
 