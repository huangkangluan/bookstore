package com.hzit.controller;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.Book;
import com.hzit.interceptor.UserInterceptor;
import com.hzit.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
@RequestMapping("/home")
public class BookController{
    @Autowired
    private BookService bookService;
    public BookController(){
        System.out.println("BookController控制器对象被创建");
    }
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        //利用拦截器注册对象。给请求添加一个拦截器对象,并指定要拦截的路径
//        UserInterceptor userInterceptor=new UserInterceptor();
//        registry.addInterceptor(userInterceptor).addPathPatterns("/home/**");
//        super.addInterceptors(registry);
//    }
    @RequestMapping("/findbook")
    public String findBook(@RequestParam(name="page",defaultValue = "0") Integer page, ModelMap modelMap){
        if(page<=0){
            page=0;
        }
        Page<Book> list=bookService.findPage(page,5);
        modelMap.put("list",list);
        modelMap.put("countpage",page);
        return "find_book";
    }
}
