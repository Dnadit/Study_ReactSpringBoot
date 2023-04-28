package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.domain.Member;
import com.example.demo.persistence.MemberRepository;

@Service
public class MemberService {
	
	private final MemberRepository memberRepo;
	
	@Autowired
	public MemberService(MemberRepository memberRepo) {
		this.memberRepo = memberRepo;
	}
	
	public Member getMember(String id) {
		return memberRepo.findById(id).get();
		
		
	}
}
