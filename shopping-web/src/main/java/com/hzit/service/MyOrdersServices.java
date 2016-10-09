package com.hzit.service;

import com.hzit.dao.vo.MyorderVo;

import java.util.List;

/**
 * Created by Administrator on 2016/10/9.
 */
public interface MyOrdersServices {
    public List<MyorderVo> findAll();
}
