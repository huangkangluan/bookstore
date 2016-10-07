package com.hzit.controller;
import com.hzit.dao.entity.Userinfo;
import com.hzit.service.UserInfoService;
import com.hzit.service.impl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
public class UserInfoController {
    @Autowired
   private UserInfoService userInfoService;
    @RequestMapping("/log")
    public String login(String userName,String userPwd){

        Map m=new HashMap();

        m.put("userName",userName);
        m.put("userPwd",userPwd);
        System.out.println(m);
       List<Userinfo> list=userInfoService.login(m);

        if(list!=null) {
            return "redirect:/findbook";
        }
        else{
            return  "redirect:/index";
        }
    }
}
