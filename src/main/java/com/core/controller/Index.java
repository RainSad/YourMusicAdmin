package com.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {

	@RequestMapping("/index.do")
	public String index(ModelMap model){
		model.addAttribute("ss", "sun111");
		model.addAttribute("ssS", "sun11122");
		return "NewFile";
	}
}
