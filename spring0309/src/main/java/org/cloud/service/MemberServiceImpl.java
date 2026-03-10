package org.cloud.service;

import java.util.List;

import org.cloud.dto.MemberInfoDTO;
import org.cloud.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;
	
	@Override
	public List<MemberInfoDTO> memberList() throws Exception {
		return memberMapper.memberList();
	}
	
	@Override
	public int writeMember(MemberInfoDTO member) throws Exception {
		memberMapper.writeMember(member);
		return 0;
	}

	@Override
	public MemberInfoDTO memberDetail(String id) throws Exception {
		return memberMapper.memberDetail(id); 
	}
	
	@Override
	public int updateMember(MemberInfoDTO member) throws Exception {
		memberMapper.updateMember(member);
		return 0;
	}
	
	@Override
	public MemberInfoDTO deleteMember(String id) throws Exception {
		return memberMapper.deleteMember(id);
	}
}
