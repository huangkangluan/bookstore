package com.hzit.service.impl;

import com.hzit.dao.entity.Dingdanxx;
import com.hzit.dao.entity.Myorder;
import com.hzit.dao.mapper.DingdanxxMapper;
import com.hzit.dao.mapper.MyorderMapper;
import com.hzit.dao.vo.BookVo;
import com.hzit.dao.vo.MyorderVo;
import com.hzit.dao.vo.OrderVo;
import com.hzit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
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
        try{
            //生成一个唯一编号
            String orderid= UUID.randomUUID().toString();
            Myorder order=new Myorder();
            order.setMyOrderId(orderid);
            order.setUserId(orderVo.getUserId());
            order.setCreateTime(new Date());
            order.setMyOrderStatus("已下单");

            List<BookVo> list=orderVo.getBookVoList();
            int sum=0;
            for (BookVo b:list){
                sum+=b.getCount()*b.getBookPrice();
            }
            order.setMyOrderPrice(sum);
            myorderMapper.insertMyorder(order);
            for (BookVo b:list){
                Dingdanxx dingdanxx=new Dingdanxx();
                dingdanxx.setMyOrderId(orderid);
                dingdanxx.setBookId(b.getBookId());
                dingdanxx.setOrderNumber(b.getCount());
                dingdanxx.setOrderPrice(b.getBookPrice());
                dingdanxxMapper.insertOrder(dingdanxx);
            }

            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<MyorderVo> findAll() {
        return null;
    }
}
