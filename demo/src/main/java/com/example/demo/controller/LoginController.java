package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Member;
import com.example.demo.service.MemberService;

@RestController
public class LoginController {
	
	private final MemberService service;	
	
	@Autowired
	public LoginController(MemberService service) {
		this.service = service;		
	}
	
	@PostMapping("/login")
	public Map<String, String> loginAuth(Member member) {		
		Map<String, String> map = new HashMap<>();
		try {
			Member findMember = service.getMember(member.getId());			
			if (member.getPass().equals(findMember.getPass())) {
				map.put("status", "success");
				map.put("msg", "로그인 성공");
				//model.addAttribute("member", findMember);
				return map;
			} else {
				map.put("status", "fail");
				map.put("msg", "비밀번호가 틀립니다");
				return map;
			}
		} catch (Exception e) {
			map.put("status", "fail");
			map.put("msg", "아이디가 없습니다");
			return map;
		}
	}
}
