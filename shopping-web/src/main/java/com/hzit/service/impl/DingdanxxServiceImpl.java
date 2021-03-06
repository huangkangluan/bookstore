package com.hzit.service.impl;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.hzit.dao.entity.Dingdanxx;
import com.hzit.dao.entity.Userinfo;
import com.hzit.dao.mapper.DingdanxxMapper;
import com.hzit.dao.vo.DingdanxxVo;
import com.hzit.service.DingdanxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/7.
 */
@Service
public class DingdanxxServiceImpl implements DingdanxxService {
    @Autowired
    private DingdanxxMapper dingdanxxMapper;


    @Override
    public Page<DingdanxxVo> findPage(Integer userId,int page, int count) {
        PageRequest pageRequest=new PageRequest(page,count);
        Map map=new HashMap();
        map.put("userId",userId);
        Page<DingdanxxVo> data=dingdanxxMapper.searchOrderByParams(map,pageRequest);
        return data;
    }
}
