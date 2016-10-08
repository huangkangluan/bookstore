package com.hzit.service;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.Dingdanxx;
import com.hzit.dao.vo.DingdanxxVo;

import java.util.List;

/**
 * Created by Administrator on 2016/10/7.
 */
public interface DingdanxxService {
    public List<DingdanxxVo> findAll();
    public Page<DingdanxxVo> findPage(int page,int count);
}
