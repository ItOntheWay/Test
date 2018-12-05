package com.yckj.commonmapper.model;

import lombok.Data;

import java.util.Date;

/**
 *基础信息
 *
 * */
@Data
public class BaseInfo {
    private Integer id;

    private Integer cameraid;

    private String faceid;

    private String reid;

    private String faceFeature;

    private String bodyFeature;

    private String roi;

    private Integer status;

    private Date createTime;

    private Date updateTime;
}
