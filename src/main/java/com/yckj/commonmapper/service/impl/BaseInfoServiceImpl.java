package com.yckj.commonmapper.service.impl;

import com.github.pagehelper.PageHelper;
import com.yckj.commonmapper.mapper.BaseInfoMapper;
import com.yckj.commonmapper.model.BaseInfo;
import com.yckj.commonmapper.service.BaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BaseInfoServiceImpl implements BaseInfoService {

    @Autowired
    private BaseInfoMapper baseInfoMapper;

    @Override
    public int addBaseInfo(BaseInfo info) {

        return baseInfoMapper.insert(info);
    }

    @Override
    public List<BaseInfo> findAllBaseInfo(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return baseInfoMapper.selectAll();
    }

}
