package com.plz.pams_back.service;

import com.plz.pams_back.vo.MainVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface MainService {
    List<MainVO> selectAll();
    List<MainVO> selectMember(HttpServletRequest request);
}
