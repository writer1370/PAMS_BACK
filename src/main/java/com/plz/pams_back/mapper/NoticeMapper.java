package com.plz.pams_back.mapper;

import com.plz.pams_back.entity.Notice;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface NoticeMapper {
    List<Notice> selectNoticeList();
}
