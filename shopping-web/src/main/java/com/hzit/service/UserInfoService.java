package com.hzit.service;

import com.hzit.dao.entity.Userinfo;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/6.
 */
public interface UserInfoService {

    public List<Userinfo> login(Map map);
}