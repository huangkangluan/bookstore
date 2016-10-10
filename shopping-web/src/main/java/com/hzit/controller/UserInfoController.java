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
    @RequestMapping("/login2")
    public String login(@RequestParam("userName")String userName,@RequestParam("passWord")String passWord,HttpSession session){



       Userinfo list=userInfoService.login(userName,passWord);

        if(userName.equals(list.getUserName())&& passWord.equals(list.getUserPwd())) {
            session.setAttribute("user",list);
            return "redirect:/home/findbook";
        }
        else{
            return  "redirect:/denglu.html";
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
    @RequestMapping("/cart/zhuxiao")
    public String zhuxiao(HttpSession session){
        System.out.println("注销用户信息");
        session.invalidate();
        return "redirect:/denglu.html";
    }
}
