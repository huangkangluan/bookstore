package com.hzit.service.impl;

import com.hzit.dao.entity.Dingdanxx;
import com.hzit.dao.mapper.DingdanxxMapper;
import com.hzit.service.DingdanxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/7.
 */
@Service
public class DingdanxxServiceImpl implements DingdanxxService {
    @Autowired
    private DingdanxxMapper dingdanxxMapper;
    @Override
    public List<Dingdanxx> findAll() {
        return  dingdanxxMapper.searchOrderByParams(null);
    }

    @Override
    public Dingdanxx findDingdanxx(int orderId) {
        Map map=new HashMap();
        map.put("orderId",orderId);
        List<Dingdanxx> list=dingdanxxMapper.searchOrderByParams(map);
        if (list.size()==1){
            return list.get(0);
        }else {
            return null;
        }
    }

    @Override
    public int updateDingdanxx(Dingdanxx dingdanxx) {
        return 0;
    }

    @Override
    public int deleteDingdanxx(int orderId) {
        int num=dingdanxxMapper.deleteOrderByOrderId(orderId);
        return num;
    }

    @Override
    public boolean addDingdanxx(Dingdanxx dingdanxx) {
        try{
            dingdanxxMapper.insertOrder(dingdanxx);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
