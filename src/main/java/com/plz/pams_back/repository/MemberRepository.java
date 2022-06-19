package com.plz.pams_back.repository;

import com.plz.pams_back.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, String> {
}
