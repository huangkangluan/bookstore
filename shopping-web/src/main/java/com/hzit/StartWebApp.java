package com.hzit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2016/9/26.
 */
@SpringBootApplication
@ComponentScan({"com.fc","com.hzit"})//扫描com.fc和com.hzit包下面的组件
@MapperScan("com.hzit.dao.mapper")//扫描所有mapper里面的接口
//继承SpringBootServletInitializer类后，将初始化一些servlet所需要的功能
public class StartWebApp extends SpringBootServletInitializer{

}
