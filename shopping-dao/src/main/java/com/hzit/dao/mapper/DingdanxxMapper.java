package com.hzit.dao.mapper;

import java.util.List;
import java.util.Map;

import com.hzit.dao.vo.DingdanxxVo;
import org.apache.ibatis.annotations.Param;
import com.hzit.dao.entity.Dingdanxx;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface DingdanxxMapper {

	void insertOrder(Dingdanxx dingdanxx);

	int deleteOrderByOrderId(Integer orderId);

	int updateOrder(Dingdanxx dingdanxx);

	Page<DingdanxxVo> searchOrderByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<DingdanxxVo> searchOrderByParams(@Param("map") Map<String, String> map);

} 
