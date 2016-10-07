package com.hzit.controller;

import com.hzit.dao.entity.Book;
import com.hzit.dao.vo.BookVo;
import com.hzit.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/7.
 */
@Controller
@RequestMapping("/cart")
public class ShopCartController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/shopcart")
    public String joinShopCart(@RequestParam("bookId") String[] bookId,HttpSession session){
        System.out.println("加入购物车的功能");
        //创建一个购物车对象，先假设session中有购物车，没有才创建
        Map cart=(Map)session.getAttribute("cart");
        //判断cart购物车没有的话就创建一个
        if (cart==null){
            cart=new HashMap();
        }
        //通过booId获取book对象
        for (int i=0;bookId!=null && i<bookId.length;i++){
            String countbooId=bookId[i];
            //通过图书ID获取图书对象
            Book book=bookService.findById(countbooId);
            BookVo bookVo=new BookVo();
            bookVo.setBookId(book.getBookId());
            bookVo.setBookName(book.getBookName());
            bookVo.setBookNumber(book.getBookNumber());
            bookVo.setBookPrice(book.getBookPrice());
            bookVo.setBookImage(book.getBookImage());
            //如果购物车里有相同的图书，那么当前的购物车数量加1，否则数量为1
            BookVo cartbookVo= (BookVo) cart.get(bookVo.getBookId());
            if (cartbookVo==null){
                bookVo.setCount(1);
            }else{
                bookVo.setCount(cartbookVo.getCount()+1);
            }
            cart.put(bookVo.getBookId(),bookVo);
        }
        session.setAttribute("cart",cart);
        return "redirect:/cart/toshopcart";
    }
    @RequestMapping("/toshopcart")
    public String shopping_cart(){
        return "shopping_cart";
    }
}
