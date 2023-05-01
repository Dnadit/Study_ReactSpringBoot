package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

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
	@CrossOrigin(origins = "http://localhost:3000")
	public Map<String, String> loginAuth(@RequestBody Member member) {		
		Map<String, String> map = new HashMap<>();
		try {
			Member findMember = service.getMember(member.getUserId());
			if (findMember == null) {
				map.put("status", "fail");			
				return map;
			}
			if (member.getPass().equals(findMember.getPass())) {	
				map.put("msg", "success");
				return map;
			} else {
				map.put("status", "fail");			
				return map;
			}	
		} catch (Exception e) {
			map.put("status", "fail");
			return map;
		}
		
	}
}
