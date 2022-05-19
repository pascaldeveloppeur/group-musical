package com.moriset.groupmusical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moriset.groupemusical.repository.ImemberRepository;
import com.moriset.groupmusical.model.Member;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	ImemberRepository memberRepository;

	@Override
	public Member saveMember(Member m) {
		
		return memberRepository.save(m);
	}

	@Override
	public Member updateMember(Member m) {
		
		return memberRepository.save(m);
	}

	@Override
	public void deleteMember(Member m) {
		memberRepository.delete(m);
	}

	@Override
	public void deleteMemberById(Long id) {
		memberRepository.deleteById(id);
		
	}

	@Override
	public Member getMember(Long id) {
		
		return memberRepository.findById(id).get();
	}

	@Override
	public List<Member> getAllMembers() {
		
		return memberRepository.findAll();
	}

}
