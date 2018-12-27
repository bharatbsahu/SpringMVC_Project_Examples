package com.pluralsight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Excercise;
import com.pluralsight.service.ExcerciseService;

@Controller
public class MinutesController {
	
	@Autowired
	private ExcerciseService excerserv;
	
	
	@RequestMapping (value = "/addMinutes")
	public String addMinutes(@ModelAttribute ("excercise") Excercise exc) {
		
		System.out.println(" Excercise :"+exc.getMinutes());
		System.out.println(" Excercise activity:"+exc.getActivity());
		
		return "addMinutes";
		//return "forward:addMoreMinutes.html";
		//return "redirect:addMoreMinutes.html";
	}
	
	@RequestMapping (value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		
	
		
		return excerserv.findAllActivities();
	}
	
/*	@RequestMapping (value = "/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute ("excercise") Excercise exc) {
		
		System.out.println(" Excercise More:"+exc.getMinutes());
		
		return "addMinutes";
	}
*/

}
