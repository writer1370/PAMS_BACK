package com.plz.pams_back.service.impl;

import com.plz.pams_back.mapper.MainMapper;
import com.plz.pams_back.service.MainService;
import com.plz.pams_back.vo.MainVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MainServiceImpl implements MainService {
    @Autowired
    MainMapper mainMapper;

    @Override
    public List<MainVO> selectAll() {
        List<MainVO> resultList = new ArrayList<MainVO>();
        resultList = mainMapper.selectAll();
        return null;
    }

    @Override
    public List<MainVO> selectMember(HttpServletRequest request) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("SEQ", request.getParameter("seq"));
        ArrayList<MainVO> list = mainMapper.selectMember(map);
        return list;
    }
}
