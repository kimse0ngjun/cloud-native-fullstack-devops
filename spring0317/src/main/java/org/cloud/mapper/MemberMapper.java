package org.cloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.cloud.dto.MemberDTO;

@Mapper
public interface MemberMapper {

	MemberDTO memberLoginCheck(MemberDTO member);
	void memberJoin(MemberDTO member);
	int idCheck(String userId);
}
