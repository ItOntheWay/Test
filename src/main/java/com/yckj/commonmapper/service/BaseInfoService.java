package com.yckj.commonmapper.service;


import com.yckj.commonmapper.model.BaseInfo;

import java.util.List;
import java.util.Map;

public interface BaseInfoService {

    public int addBaseInfo(BaseInfo info);

    public List<BaseInfo> findAllBaseInfo(int pageNum, int pageSize);

}
