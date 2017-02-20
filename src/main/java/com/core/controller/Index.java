package com.core.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.model.sys.sysUser;
import com.core.service.SysUserService;
import com.util.captcha.Captcha;

@Controller
public class Index {
	
	@Autowired
	private SysUserService sysUserService;
	
	String captchaCode = null;

	@RequestMapping("/loginCheck.do")
	public String loginCheck(String captcha ,String username,String password, ModelMap model) {
		sysUser userInfo = sysUserService.userInfo(1);
		if("" == captcha){
			model.addAttribute("msg", "请输入验证码");
			model.addAttribute("username", "admin");
			return "login";
		}else if(!this.captchaCode.equalsIgnoreCase(captcha)){
			model.addAttribute("msg" , "验证码不正确");
			return "login";
		}else if(userInfo != null){
			return "redirect:/index.do";
		}else{
			model.addAttribute("msg" , "无此用户");
			return "login";
		}
	}
	
	@RequestMapping("/index.do")
	public String index(ModelMap model) {
		return "index";
	}
	
	@RequestMapping("/login.do")
	public String login(ModelMap model) {
		
		
		
		return "login";
	}

	@RequestMapping("/captcha.do")
	public void login(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws IOException {
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/jpeg");

		// 生成随机字串
		String verifyCode = Captcha.generateVerifyCode(4);
		//图片文字给到全局变量
		captchaCode = verifyCode;
		// 存入会话session
		HttpSession session = request.getSession(true);
		// 删除以前的
		session.removeAttribute("verCode");
		session.setAttribute("verCode", verifyCode.toLowerCase());
		// 生成图片
		int w = 100, h = 30;
		Captcha.outputImage(w, h, response.getOutputStream(), verifyCode);
	}
}
