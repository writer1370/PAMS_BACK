package com.plz.pams_back.controller;

import com.plz.pams_back.dto.NoticeDto;
import com.plz.pams_back.entity.Notice;
import com.plz.pams_back.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/notice")
public class NoticeController {

    @Autowired
    NoticeService noticeService;

    @GetMapping(value="/select")
    @ResponseBody
    public Map<String,List> selectNoticeList() {
        System.out.println("selectNoticeList =====> start");
        HashMap<String, List> resultMap = new HashMap<String, List>();

        List<Notice> noticeList = noticeService.selectNoticeList();
        resultMap.put("data", noticeList);

        return resultMap;
    }

    @GetMapping(value="/selectDetail")
    @ResponseBody
    public Map<String, Notice> selectNoticeDetail(String num) {
        System.out.println("selectNoticeDetail =====> start");
        System.out.println(num);
        HashMap<String, Notice> resultMap = new HashMap<String, Notice>();

        Notice noticeDetail = noticeService.selectNoticeDetail(num);
        resultMap.put("data", noticeDetail);
        return resultMap;
        /*HashMap<String, List> resultMap = new HashMap<String, List>();
        List<Notice> noticeList = noticeService.selectNoticeList();
        resultMap.put("data", noticeList);*/

    }

    @PostMapping(value="/insert")
    @ResponseBody
    public int insertNotice(@RequestBody NoticeDto noticeDto) {
        System.out.println("insertNotice =====> start");
        System.out.println("noticeTitle   : "   + noticeDto.getNoticeTitle());
        System.out.println("noticeContent : " + noticeDto.getNoticeContent());
        int cnt = noticeService.insertNotice(noticeDto);
        return 0;
    }
}
