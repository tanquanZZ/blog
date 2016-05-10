package com.endlessblue.basic.publics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController{
	
	@RequestMapping("/")
	public String index(Model model){
		return "index";
	}
	@RequestMapping("/test2")
	public String index2(Model model){
		return "index2";
	}

}
