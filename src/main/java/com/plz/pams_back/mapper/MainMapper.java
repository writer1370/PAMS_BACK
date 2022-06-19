package com.plz.pams_back.mapper;

import com.plz.pams_back.entity.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Mapper
public interface MainMapper {
    List<Member> selectAll();
    ArrayList<Member> selectMember(Map<String, String> map);
}
