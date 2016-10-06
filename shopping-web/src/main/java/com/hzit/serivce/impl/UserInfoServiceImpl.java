package com.hzit.serivce.impl;

import com.hzit.dao.entity.Userinfo;
import com.hzit.dao.mapper.UserinfoMapper;
import com.hzit.serivce.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/6.
 */@Service
public class UserInfoServiceImpl implements UserInfoService {
   @Autowired
    private UserinfoMapper userinfoMapper;
    @Override

    public List<Userinfo> login(@RequestParam("user") String user, @RequestParam("pwd") String pwd) {
        Map a=new HashMap();
        a.put("user",user);
        a.put("pwd",pwd);
       List<Userinfo> list=userinfoMapper.searchUserinfoByParams(a);
        if (!list.equals(null)){
            return list;
        }
         return null;
    }
}
