package org.cloud.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.cloud.dto.NoticeDTO;

@Mapper
public interface NoticeMapper {

	List<NoticeDTO> noticeList() throws Exception;
	int writeNotice(NoticeDTO notice) throws Exception;
	NoticeDTO noticeDetail(int id) throws Exception;
	int updateNotice(NoticeDTO notice) throws Exception;
	NoticeDTO deleteNotice(int id) throws Exception;
	int updateHit(int id) throws Exception;
}
