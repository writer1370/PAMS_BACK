package com.plz.pams_back.controller;

import com.plz.pams_back.service.MainService;
import com.plz.pams_back.vo.MainVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    MainService mainService;

    @GetMapping(value="/all")
    @ResponseBody
    public Map<String,List> selectAll() {
        System.out.println("@@@@ ALL @@@@@");
        HashMap<String, List> resultMap = new HashMap<String, List>();
        List<MainVO> list = mainService.selectAll();
        resultMap.put("data", list);
        System.out.println("@@@@ ALL fin @@@@@");
        return resultMap;
    }

    @GetMapping(value="/member")
    @ResponseBody
    public Map<String,List> selectMember(HttpServletRequest request) {
        System.out.println("@@@@ MEMBER @@@@@");
        HashMap<String, List> resultMap = new HashMap<String, List>();
        List<MainVO> list = mainService.selectMember(request);
        resultMap.put("data", list);
        System.out.println("@@@@ MEMBER fin @@@@@");
        return resultMap;
    }
}
