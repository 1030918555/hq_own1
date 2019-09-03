package com.hq.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hq.bean.User;

public interface UserDAO {

	List list(Map map);

	List deptList();

	int add(User user);

	User getUser(@Param("uid")Integer uid);

	int upd(User user);

}
