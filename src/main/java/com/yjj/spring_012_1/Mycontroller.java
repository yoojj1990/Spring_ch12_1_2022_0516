package com.yjj.spring_012_1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("board")
public class Mycontroller {
	
	
	@RequestMapping(value = "/write")
	public String write() {
		return "/board/write";
	}
	
	
	@RequestMapping("/reply")
	public ModelAndView reply() {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("memberId", "BlackTiger");
		
		mv.setViewName("board/reply");
		
		
		return mv;
	}
	
	
	@RequestMapping("/content")
	public String content(Model model) {
		
		model.addAttribute("memberId", "tiger");
		
		
		
		return "/board/content";
	}
	
	
	
	
	
	
	
	
	
	
}
