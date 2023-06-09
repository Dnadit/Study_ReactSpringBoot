package com.example.demo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

}
