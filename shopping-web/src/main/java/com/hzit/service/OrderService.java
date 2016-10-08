package com.hzit.service;

import com.hzit.dao.vo.MyorderVo;
import com.hzit.dao.vo.OrderVo;

import java.util.List;

/**
 * Created by Administrator on 2016/10/8.
 */
public interface OrderService {
    public boolean addOrder(OrderVo orderVo);
    public List<MyorderVo> findAll();
}
