package com.hzit.controller;

import com.hzit.service.MyorderService;
import com.hzit.service.impl.MyorderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/8.
 */@Controller
public class MyorderController {
    @Autowired
    private MyorderService myorderService;

    @RequestMapping("/myorder")
    public String findorder(HttpSession session){
         session.getAttribute("cart");


        return "";
    }
}
