package com.hzit.controller;

import com.hzit.dao.entity.Userinfo;
import com.hzit.serivce.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
public class UserInfoController {
    @Autowired
   private UserInfoService userInfoSerivce;
    @RequestMapping("/login")
    public String login(String user,String pwd){
       List<Userinfo> list=userInfoSerivce.login(user,pwd);
        if(list!=null) {
            return "book";
        }
        else{
            return  "login";
        }
    }
}
