package com.hzit.controller;

import com.hzit.dao.vo.MyorderVo;
import com.hzit.service.MyOrdersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2016/10/9.
 */
@Controller
public class MydeOrdersController {
    @Autowired
    private MyOrdersServices myOrdersServices;
    @RequestMapping("/findOreders")
    @ResponseBody
    public Object findOreders(){
        List<MyorderVo> list=myOrdersServices.findAll();
        return list;
    }
}
