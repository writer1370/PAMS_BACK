package com.plz.pams_back.service;

import com.plz.pams_back.entity.Member;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface MainService {
    List<Member> selectAll();
    List<Member> selectMember(HttpServletRequest request);
    List<Member> findAll();
}
