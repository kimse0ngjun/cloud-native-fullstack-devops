package org.cloud.service;

import org.cloud.dto.MemberDTO;
import org.cloud.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServicelmpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;
	
	@Override
	public MemberDTO memberLoginCheck(MemberDTO member) {
		return memberMapper.memberLoginCheck(member);
	}
	
	@Override
	public void memberJoin(MemberDTO member) {
		memberMapper.memberJoin(member);
	}
	
	@Override
	public int idCheck(String userId) {
		return memberMapper.idCheck(userId);
	}
}
