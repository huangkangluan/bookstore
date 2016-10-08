package com.hzit.controller;

import com.hzit.dao.entity.Userinfo;
import com.hzit.dao.vo.BookVo;
import com.hzit.dao.vo.OrderVo;
import com.hzit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/8.
 */
@Controller
@RequestMapping("/cart")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/addOrder")
    public Object addOrder(HttpSession session){
        //获取session中用户对象
        Userinfo userinfo= (Userinfo) session.getAttribute("user");
        //获取session中购物车对象
        Map<Integer,BookVo> cart= (Map) session.getAttribute("cart");
        //获取购物车的所有值
        Collection<BookVo> value=cart.values();
        //创建个ArrayList集合
        List list=new ArrayList();
        for (BookVo b:value){
            //将购物车的所有值转移到集合中，以便放入到订单对象中
            list.add(b);
        }
        OrderVo vo=new OrderVo();
        vo.setUserId(userinfo.getUserId());
        vo.setBookVoList(list);
        boolean boo=orderService.addOrder(vo);
        return boo;
    }
}
