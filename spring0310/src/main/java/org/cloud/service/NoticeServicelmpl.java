package org.cloud.service;

import java.util.List;

import org.cloud.dto.NoticeDTO;
import org.cloud.mapper.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeServicelmpl implements NoticeService {

	@Autowired
	NoticeMapper noticeMapper;
	
	@Override
	public List<NoticeDTO> noticeList() throws Exception {
		return noticeMapper.noticeList();
	}
	
	@Override
	public int writeNotice(NoticeDTO notice) throws Exception {
		noticeMapper.writeNotice(notice);
		return 0;
	}
	
	@Override
	public NoticeDTO noticeDetail(int id) throws Exception {
		noticeMapper.updateHit(id);
		return noticeMapper.noticeDetail(id);
	}
	
	@Override
	public int updateNotice(NoticeDTO notice) throws Exception {
		noticeMapper.updateNotice(notice);
		return 0;
	}
	
	@Override
	public NoticeDTO deleteNotice(int id) throws Exception {
		return noticeMapper.deleteNotice(id);
	}
	
	@Override
	public int updateHit(int id) throws Exception {
		noticeMapper.updateHit(id);
		return 0;
	}
}
