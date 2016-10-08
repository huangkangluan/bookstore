package com.hzit.service.impl;
import com.hzit.dao.entity.Book;
import com.hzit.dao.entity.Dingdanxx;
import com.hzit.dao.entity.Myorder;
import com.hzit.dao.mapper.DingdanxxMapper;
import com.hzit.dao.mapper.MyorderMapper;
import com.hzit.dao.vo.BookVo;
import com.hzit.dao.vo.MyorderVo;
import com.hzit.service.MyorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2016/10/8.
 */@Service
public class MyorderServiceImpl implements MyorderService {
    @Autowired
    private MyorderMapper myorderMapper;
    @Autowired
    private DingdanxxMapper dingdanxxMapper;
    @Override
    public boolean addOrder(MyorderVo myorderVo) {
        String myOrderId = UUID.randomUUID().toString();//生成唯一的id
         try {

            //增加订单数据
            Myorder myorder = new Myorder();
            myorder.setMyOrderId(myOrderId);
            myorder.setCreateTime(new Date());
            myorder.setMyOrderStatus("下单成功");
            myorder.setUserId(myorderVo.getUserId());
            int sum = 0;
            List<BookVo> xiangqing = myorderVo.getGetbooklist();
            for (BookVo b : xiangqing) {
                sum += b.getBookPrice() * b.getBookNumber();
            }
            myorder.setMyOrderPrice(sum);
            myorderMapper.insertMyorder(myorder);
            //增加详情订单

            for (BookVo b : xiangqing) {
                Dingdanxx dd = new Dingdanxx();
                dd.setBookId(b.getBookId());
                 dd.setMyOrderId(myOrderId);
                dd.setOrderNumber(b.getBookNumber());
                dd.setOrderPrice(b.getBookPrice());
                dingdanxxMapper.insertOrder(dd);

            }
            return true;        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }


    }
}
