package com.hzit.service;

import com.hzit.dao.entity.Dingdanxx;

import java.util.List;

/**
 * Created by Administrator on 2016/10/7.
 */
public interface DingdanxxService {
    public List<Dingdanxx> findAll();
    public Dingdanxx findDingdanxx(int orderId);
    public int updateDingdanxx(Dingdanxx dingdanxx);
    public int deleteDingdanxx(int orderId);
    public boolean addDingdanxx(Dingdanxx dingdanxx);
}
