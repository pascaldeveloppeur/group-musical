package com.moriset.groupmusical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.moriset.groupmusical.model.Member;
import com.moriset.groupmusical.service.MemberService;

@RestController
@EnableJpaRepositories(basePackages = {"com.moriset"})
public class MemberController {
	
	@Autowired
	
	MemberService memberService;
	
	@GetMapping("/members")
	
	public List<Member> getAllMembers(){
		List<Member> list = memberService.getAllMembers();
		return list;
	}
	
	@PostMapping("/addMembers")
	public Member addMembers(@RequestBody Member member) {
		return memberService.saveMember(member);
	}
	
	@DeleteMapping("/deleteMember/{id}")
	public void deleteMember(@PathVariable("id")Long idMember) {
		memberService.deleteMemberById(idMember);
	}
	

}
