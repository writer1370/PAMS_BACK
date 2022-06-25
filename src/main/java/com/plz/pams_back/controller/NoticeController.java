package com.plz.pams_back.controller;

import com.plz.pams_back.entity.Notice;
import com.plz.pams_back.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class NoticeController {

    @Autowired
    NoticeService noticeService;

    @GetMapping(value="/notice")
    @ResponseBody
    public Map<String,List> selectNoticeList() {
        System.out.println("selectNoticeList =====> start");
        HashMap<String, List> resultMap = new HashMap<String, List>();

        List<Notice> noticeList = noticeService.selectNoticeList();
        resultMap.put("data", noticeList);

        return resultMap;
    }
}
