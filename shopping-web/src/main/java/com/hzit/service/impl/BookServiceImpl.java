package com.hzit.service.impl;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.hzit.dao.entity.Book;
import com.hzit.dao.mapper.BookMapper;
import com.hzit.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    public BookServiceImpl(){
        System.out.println("BookServiceImpl业务逻辑对象被创建");
    }
    @Override
    public List<Book> findBook() {
        return null;
    }

    @Override
    public Page<Book> findPage(int page, int count) {
        PageRequest pageRequest=new PageRequest(page,count);
        Page<Book> data=bookMapper.searchBookByParams(null, pageRequest);
        return data;
    }
}
