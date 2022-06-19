package com.plz.pams_back.controller;

import com.plz.pams_back.service.MainService;
import com.plz.pams_back.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class MainController {

    @Autowired
    MainService mainService;

    @GetMapping(value="/all")
    @ResponseBody
    public Map<String,List> selectAll() {
        System.out.println("@@@@ ALL @@@@@");
        HashMap<String, List> resultMap = new HashMap<String, List>();
        List<Member> list = mainService.selectAll();
        resultMap.put("data", list);
        System.out.println("@@@@ ALL fin @@@@@");
        return resultMap;
    }

    @GetMapping(value="/member")
    @ResponseBody
    public Map<String,List> selectMember(HttpServletRequest request) {
        System.out.println("@@@@ MEMBER @@@@@");
        HashMap<String, List> resultMap = new HashMap<String, List>();
        List<Member> list = mainService.selectMember(request);
        resultMap.put("data", list);
        System.out.println("@@@@ MEMBER fin @@@@@");
        return resultMap;
    }

    @GetMapping(value="/member_jpa")
    @ResponseBody
    public Map<String,List>  selectMember_jpa(HttpServletRequest request) {
        System.out.println("@@@@ MEMBER JPA @@@@@");
        HashMap<String, List> resultMap = new HashMap<String, List>();
        List<Member> result = mainService.findAll();
        resultMap.put("data", result);
        System.out.println("@@@@ MEMBER fin @@@@@");
        return resultMap;
    }
}
