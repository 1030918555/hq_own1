package com.hq.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hq.bean.User;
import com.hq.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserDAO userDAO;

	@Override
	public List list(Map map) {
		// TODO Auto-generated method stub
		return userDAO.list(map);
	}

	@Override
	public List deptList() {
		return userDAO.deptList();
	}

	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		return userDAO.add(user);
	}

	@Override
	public User getUser(Integer uid) {
		// TODO Auto-generated method stub
		return userDAO.getUser(uid);
	}

	@Override
	public int upd(User user) {
		// TODO Auto-generated method stub
		return userDAO.upd(user);
	}
}
