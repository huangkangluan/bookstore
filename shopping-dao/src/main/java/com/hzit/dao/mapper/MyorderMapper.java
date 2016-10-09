package com.hzit.dao.mapper;

import java.util.List;
import java.util.Map;

import com.hzit.dao.vo.MyorderVo;
import org.apache.ibatis.annotations.Param;
import com.hzit.dao.entity.Myorder;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface MyorderMapper {

	void insertMyorder(Myorder myorder);

	void deleteMyorderByMyOrderId(Integer myOrderId);

	void updateMyorder(Myorder myorder);

	Page<MyorderVo> searchMyorderByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<MyorderVo> searchMyorderByParams(@Param("map") Map<String, String> map);

} 
