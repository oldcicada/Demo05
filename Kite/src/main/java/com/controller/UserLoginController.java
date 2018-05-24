package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.po.User;
import com.service.UserService;

@Controller
public class UserLoginController {

	@Autowired
	private UserService userService;
	
	//登录get请求
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginGet(Model model,HttpServletRequest request) {
		return "login";
	}
	
	//登录post用户验证
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginPost(Model model,HttpServletRequest request,String name,String password) {
			
			User user = userService.queryUser(name, password);
			if(user == null){
				request.setAttribute("error","账号或密码不正确!");
				return "login";
				
			}else{
			HttpSession session = request.getSession(true);
		    session.setAttribute("user",user);
		    if(user.getDepartment().equals("民政部")) {
		    	return "redirect:/user/indexMz";
		    }
		    if(user.getDepartment().equals("社会事务处")) {
		    	return "redirect:/user/indexSh";
		    }
		    if(user.getDepartment().equals("福慈处")) {
		    	return "redirect:/user/indexFc";
		    }
		    if(user.getDepartment().equals("法宣办")) {
		    	return "redirect:/user/indexFx";
		    }
		    return "redirect:/user/index";
	        }
  }
	
	
	
	//主页超级管理员用户登录
	@RequestMapping(value="/user/index",method=RequestMethod.GET)
	public String indexGet(Model model,HttpServletRequest request) {

		HttpSession session = request.getSession(true);
	    User user = (User) session.getAttribute("user");
	    if(!(user.getDepartment().equals("boss"))) {
	    	return "login";
	    }
		return "tzgg/index";
	}
	//主页民政用户登录
		@RequestMapping(value="/user/indexMz",method=RequestMethod.GET)
		public String indexMzGet(Model model,HttpServletRequest request) {
			
			HttpSession session = request.getSession(true);
		    User user = (User) session.getAttribute("user");
		    if(!(user.getDepartment().equals("民政部"))) {
		    	return "login";
		    }
			return "tzgg/indexMz";
		}
	//主页社会事务处用户登录
	@RequestMapping(value="/user/indexSh",method=RequestMethod.GET)
	public String indexShGet(Model model,HttpServletRequest request) {
		
		HttpSession session = request.getSession(true);
	    User user = (User) session.getAttribute("user");
	    if(!(user.getDepartment().equals("社会事务处"))) {
	    	return "login";
	    }
		return "tzgg/indexSh";
	}
	//主页福慈处用户登录
	@RequestMapping(value="/user/indexFc",method=RequestMethod.GET)
	public String indexFcGet(Model model,HttpServletRequest request) {
		HttpSession session = request.getSession(true);
	    User user = (User) session.getAttribute("user");
	    if(!(user.getDepartment().equals("福慈处"))) {
	    	return "login";
	    }
		return "tzgg/indexFc";
	}
	//主页法宣办用户登录
		@RequestMapping(value="/user/indexFx",method=RequestMethod.GET)
		public String indexFxGet(Model model,HttpServletRequest request) {
			HttpSession session = request.getSession(true);
		    User user = (User) session.getAttribute("user");
		    if(!(user.getDepartment().equals("法宣办"))) {
		    	return "login";
		    }
			return "tzgg/indexFx";
		}
	
	
	
	
	//用户注销
    @RequestMapping(value="/user/cancel",method=RequestMethod.GET)
	public void cancelGet(Model model,HttpServletRequest request,HttpServletResponse response) {
    	HttpSession session  = request.getSession(true);
		session.removeAttribute("user");
		try {
			response.getWriter().write("<script>parent.window.location.href = '../login'; </script>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
}
