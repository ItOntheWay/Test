package com.yckj.commonmapper.controller;

import com.yckj.commonmapper.model.BaseInfo;
import com.yckj.commonmapper.service.BaseInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/baseinfo")
public class BaseInfoController {
    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BaseInfoService baseInfoService;

    @RequestMapping(value = "/query")
    public ResponseEntity<?> query(HttpServletRequest request, HttpServletResponse response,
                                   Integer pageNum,Integer pageSize) {
        List<BaseInfo> list = baseInfoService.findAllBaseInfo(pageNum, pageSize);
       return ResponseEntity.ok(list);
    }
}
