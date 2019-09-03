package com.hq.service;

import java.util.List;
import java.util.Map;

import com.hq.bean.User;

public interface UserService {

	List list(Map map);

	List deptList();

	int add(User user);

	User getUser(Integer uid);

	int upd(User user);

}
