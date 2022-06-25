package com.plz.pams_back.service.impl;

import com.plz.pams_back.entity.Notice;
import com.plz.pams_back.mapper.NoticeMapper;
import com.plz.pams_back.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> selectNoticeList() {
        return noticeMapper.selectNoticeList();
    }
}
