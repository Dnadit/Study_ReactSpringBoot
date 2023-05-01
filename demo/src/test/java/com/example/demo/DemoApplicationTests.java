package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.domain.Member;
import com.example.demo.persistence.MemberRepository;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	private MemberRepository memberRepo;
	
	@Test
	void contextLoads() {
		memberRepo.save(new Member().builder()
				.userId("aaa")
				.pass("1234")
				.name("dnadit").build());
	}

}
