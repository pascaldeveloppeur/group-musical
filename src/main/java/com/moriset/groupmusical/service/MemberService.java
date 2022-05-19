package com.moriset.groupmusical.service;

import java.util.List;

import com.moriset.groupmusical.model.Member;

public interface MemberService {
	
	Member saveMember(Member m);
	Member updateMember(Member m);
	void deleteMember(Member m);
	void deleteMemberById(Long id);
	Member getMember(Long id);
	List<Member> getAllMembers();
	
	

}
