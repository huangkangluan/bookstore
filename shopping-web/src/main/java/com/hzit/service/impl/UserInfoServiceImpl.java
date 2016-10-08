package com.hzit.service.impl;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.Userinfo;
import com.hzit.dao.mapper.UserinfoMapper;
import com.hzit.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

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
         public Userinfo login(String userName,String passWord) {

        try{
            Map m=new HashMap();
            m.put("userName",userName);
            m.put("passWord",passWord);
            List<Userinfo> list = userinfoMapper.searchUserinfoByParams(m);

            if (list.size()==1) {
                return list.get(0);
            } else {
                return null;
            }
        }catch (Exception ex){
            System.out.print(ex.getMessage());
            return null;
        }

    }

    @Override
    public int adduser(Userinfo userinfo) {
       int us= userinfoMapper.insertUserinfo(userinfo);

        if(us==1){
            System.out.println("注册成功");
            return 1;
        }
        else {
            System.out.println("注册失败");
            return 0;
        }
    }

}

