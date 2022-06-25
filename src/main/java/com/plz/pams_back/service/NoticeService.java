package com.plz.pams_back.service;

import com.plz.pams_back.entity.Notice;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface NoticeService {
    List<Notice> selectNoticeList();
}
