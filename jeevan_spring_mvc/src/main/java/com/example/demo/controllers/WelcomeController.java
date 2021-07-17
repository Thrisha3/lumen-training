package com.example.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.BloodDonor;

@Controller
public class WelcomeController {
	
	
	@Autowired
	private ModelAndView mdlView;
	
	@Autowired
	private BloodDonor donor;
	
	public void setDonor(BloodDonor donor) {
		this.donor=donor;
	}
	
	
	@RequestMapping("/")
	public String init (Model model){
		
		model.addAttribute("title", "Jeevan Blood Bank");
		return "index";
		
	}

	@RequestMapping(value="/donors" ,method=RequestMethod.GET)
	public ModelAndView addDonor() {
		
		mdlView.setViewName("addDonor");
		mdlView.addObject("command", donor);
		return mdlView;
		
	
	}
	
	@RequestMapping(value="/donors" , method= RequestMethod.POST)
	public String submitDonor(@Valid @ModelAttribute("command") BloodDonor entity, BindingResult result) {
		
		//System.out.println(entity);
		//return "index";
		if(result.hasErrors()) {
			return "addDonor";
			
		}else {
			
		
		return "success";
		}
	}
	
	@ModelAttribute("groups")
	public String[] booldGroups() {
		return new String[] {"apos","aneg","bpos","bneg","opos","oneg"};
		
	}
	
	
	
		
}
