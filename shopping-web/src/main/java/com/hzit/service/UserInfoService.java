package com.hzit.service;

import com.hzit.dao.entity.Userinfo;


/**
 * Created by Administrator on 2016/10/6.
 */
public interface UserInfoService {

    public Userinfo login(String user, String pwd);

    public int adduser(Userinfo userinfo);
}
