package com.hq.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hq.bean.User;
import com.hq.service.UserService;

@Controller
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("list.do")
	public String list(Model model,@RequestParam(value="cpage",defaultValue="1")Integer cpage,
			String mohu1
			) {
		
		Map map=new HashMap();
		map.put("mohu1", mohu1);
		// 分页 
		PageHelper.startPage(cpage,5);
		List list=userService.list(map);
		// 分页信息
		PageInfo pi=new PageInfo(list);
		
		model.addAttribute("list", list);
		model.addAttribute("pi", pi);
		model.addAttribute("map", map);
		return "list";
	}
	
	@RequestMapping("toadd.do")
	public String toadd() {
		return "add";
	}
	
	@RequestMapping("deptList.do")
	@ResponseBody
	public Object deptList() {
		List list=userService.deptList();
		return list;
	}
	@RequestMapping("add.do")
	public String add(User user) {
		int i=userService.add(user);
		if(i>0) {
			return "redirect:list.do";
		}else {
			return "error";
		}
	}
	@RequestMapping("toupd.do")
	public String toupd(Integer uid) {
		return "upd";
	}
	@RequestMapping("getUser.do")
	@ResponseBody
	public Object getUser(Integer uid) {
		User user=userService.getUser(uid);
		return user;
	}
	@RequestMapping("upd.do")
	public String upd(User user) {
		int i=userService.upd(user);
		if(i>0) {
			return "redirect:list.do";
		}else {
			return "error";
		}
	}
}
