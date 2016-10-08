package com.hzit.service.impl;

import com.hzit.dao.mapper.DingdanxxMapper;
import com.hzit.dao.mapper.MyorderMapper;
import com.hzit.dao.vo.OrderVo;
import com.hzit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Administrator on 2016/10/8.
 */
@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private DingdanxxMapper dingdanxxMapper;
    @Autowired
    private MyorderMapper myorderMapper;
    @Override
    public boolean addOrder(OrderVo orderVo) {
        //生成一个唯一编号
        String orderid= UUID.randomUUID().toString();
        OrderVo order=new OrderVo();
        order.setMyOrderId(orderid);
        order.setUserId(orderVo.getUserId());
        order.setCreateTime(new Date());
        return false;
    }
}
