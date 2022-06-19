package com.plz.pams_back.service.impl;

import com.plz.pams_back.mapper.MainMapper;
import com.plz.pams_back.repository.MemberRepository;
import com.plz.pams_back.service.MainService;
import com.plz.pams_back.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Service
public class MainServiceImpl implements MainService {
    @Autowired
    MainMapper mainMapper;
    @Autowired
    MemberRepository memberRepository;

    @Override
    public List<Member> selectAll() {
        List<Member> resultList = new ArrayList<Member>();
        resultList = mainMapper.selectAll();
        return null;
    }

    @Override
    public List<Member> selectMember(HttpServletRequest request) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("SEQ", request.getParameter("seq"));
        ArrayList<Member> list = mainMapper.selectMember(map);
        return list;
    }

    @Override
    public List<Member> findAll() {
        List<Member> list = new ArrayList<>();
        list = memberRepository.findAll();
        System.out.println(list);
        return list;
    }

}
