package com.hzit.service;
import com.hzit.dao.entity.Userinfo;
import com.hzit.service.impl.UserInfoServiceImpl;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/6.
 */

public class TTest {
@Test
 public void login(){
    UserInfoServiceImpl us=new UserInfoServiceImpl();
       Map m=new HashMap();
    m.put("userName","李斯康");
    m.put("userPwd","8888");
         List<Userinfo> list= us.login(m);
        if(list!=null){
            System.out.println("登录成功");
        }
        else {
            System.out.println("失败");
        }
    }
}
