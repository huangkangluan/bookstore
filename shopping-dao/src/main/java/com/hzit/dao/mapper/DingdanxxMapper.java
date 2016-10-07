package com.hzit.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.hzit.dao.entity.Dingdanxx;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface DingdanxxMapper {

	void insertOrder(Dingdanxx order);

	void deleteOrderByOrderId(Integer orderId);

	void updateOrder(Dingdanxx order);

	Page<Dingdanxx> searchOrderByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Dingdanxx> searchOrderByParams(@Param("map") Map<String, String> map);

} 
