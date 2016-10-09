package com.hzit.service.impl;

import com.hzit.dao.mapper.MyorderMapper;
import com.hzit.dao.vo.MyorderVo;
import com.hzit.service.MyOrdersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/10/9.
 */
@Service
public class MyOrederServiceImpl implements MyOrdersServices{
    @Autowired
    private MyorderMapper myorderMapper;
    @Override
    public List<MyorderVo> findAll() {
        return myorderMapper.searchMyorderByParams(null);

    }
}
