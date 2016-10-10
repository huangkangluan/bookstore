package com.hzit.controller;

import com.hzit.interceptor.UserInterceptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2016/10/10.
 */
@Controller
public class BaseController extends WebMvcConfigurerAdapter {
        @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //利用拦截器注册对象。给请求添加一个拦截器对象,并指定要拦截的路径
        UserInterceptor userInterceptor=new UserInterceptor();
        registry.addInterceptor(userInterceptor).addPathPatterns("/cart/**");
        super.addInterceptors(registry);
    }

}
