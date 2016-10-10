package com.hzit.controller;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.Userinfo;
import com.hzit.dao.vo.DingdanxxVo;
import com.hzit.service.DingdanxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/10/8.
 */
@Controller
@RequestMapping("/dingdanxx")
public class DingdanxxController {
    @Autowired
    private DingdanxxService dingdanxxService;
    @RequestMapping("/findDingdanxx")
    public Object findDingdanxx(@RequestParam(name="page",defaultValue = "0") Integer page, ModelMap modelMap,HttpSession session){
        if(page<=0){
            page=0;
        }
        Userinfo userinfo= (Userinfo) session.getAttribute("user");
        Page<DingdanxxVo> list=dingdanxxService.findPage(userinfo.getUserId(),page, 5);

        modelMap.put("list",list);
        modelMap.put("countpage",page);
        return "myorders";
    }
}
