package com.yjj.spring_012_1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mycontroller {
	
	
	@RequestMapping(value = "/write")
	public String write() {
		return "write";
	}
	
	
	@RequestMapping("/board/reply")
	public ModelAndView reply() {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("memberId", "BlackTiger");
		
		mv.setViewName("board/reply");
		
		
		return mv;
	}
	
	
	@RequestMapping("/board/content")
	public String content(Model model) {
		
		model.addAttribute("memberId", "tiger");
		
		
		
		return "/board/content";
	}
	
	
	
	
	
	
	
	
	
	
}
