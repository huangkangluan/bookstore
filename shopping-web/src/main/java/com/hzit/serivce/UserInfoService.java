package com.hzit.serivce;

import com.hzit.dao.entity.Userinfo;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
public interface UserInfoService {

    public List<Userinfo> login(String user, String pwd);
}
