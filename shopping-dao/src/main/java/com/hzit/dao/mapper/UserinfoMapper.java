package com.hzit.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.hzit.dao.entity.Userinfo;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface UserinfoMapper {

	int insertUserinfo(Userinfo userinfo);

	void deleteUserinfoByUserId(Integer userId);

	void updateUserinfo(Userinfo userinfo);

	Page<Userinfo> searchUserinfoByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Userinfo> searchUserinfoByParams(@Param("map") Map<String, String> map);

} 
