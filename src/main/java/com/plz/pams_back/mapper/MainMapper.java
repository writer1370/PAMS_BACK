package com.plz.pams_back.mapper;

import com.plz.pams_back.vo.MainVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Mapper
public interface MainMapper {
    List<MainVO> selectAll();
    ArrayList<MainVO> selectMember(Map<String, String> map);
}
