package com.pragim.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldCtrl {
	

	
	@RequestMapping("/sayhello")
	public ModelAndView sayHello(){
		return new ModelAndView("success", "key", "<b>Welcome to Spring MVC programming!!!!</b>");
	}
	
	@RequestMapping("/")
	public ModelAndView welcomePage(){
		return new ModelAndView("index", "key", "<b>welcome file</b>");
	}
	
	
	@RequestMapping("/colorlist")
	public String getColors(Model model){
		
		List<String> colorlist = new ArrayList<String>();
		colorlist.add("green");
		colorlist.add("while");
		colorlist.add("orange");
		colorlist.add("blue");
		colorlist.add("black");
		
		model.addAttribute("colors", colorlist);
		model.addAttribute("key", "<b>Welcome to Spring MVC programming!!!!</b>");
		return "success";
		
		//return new ModelAndView("success", "colors", colorlist);
	}
	

}
