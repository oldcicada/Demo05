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
			return "redirect:/user/index";
	        }
  }
	
	//主页get请求
	@RequestMapping(value="/user/index",method=RequestMethod.GET)
	public String indexGet(Model model,HttpServletRequest request) {
		
		return "tzgg/index";
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
