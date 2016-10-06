package com.hzit.controller;
import com.hzit.dao.entity.Userinfo;
import com.hzit.service.UserInfoService;
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
   private UserInfoService userInfoSerivce;
    @RequestMapping("/login")
    public String login(String user,String pwd){
        Map m=new HashMap();
        m.put("user",user);
        m.put("pwd",pwd);
       List<Userinfo> list=userInfoSerivce.login(m);
        if(list!=null) {
            return "book";
        }
        else{
            return  "index.jsp";
        }
    }
}
