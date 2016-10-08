package com.hzit.controller;
import com.hzit.dao.entity.Userinfo;
import com.hzit.service.UserInfoService;
import com.hzit.service.impl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
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
    public String login(@RequestParam("userName")String userName,@RequestParam("passWord")String passWord,HttpSession session){



       Userinfo list=userInfoService.login(userName,passWord);

        if(list!=null) {
            session.setAttribute("user",list);
            return "redirect:/home/findbook";
        }
        else{
            return  "login.html";
        }
    }
        @RequestMapping("/addu")
          public String adduser(Userinfo userinfo,ModelMap modelMap){
          int u=  userInfoService.adduser(userinfo);
            if(u==1){
            return "register_success";
}
            else {
                System.out.println("注册失败");
                return "register";
            }
        }
}
