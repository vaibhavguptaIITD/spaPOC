package com.hcentive.poc.enrollment.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcentive.poc.enrollment.dto.EnrollmentDTO;
import com.hcentive.poc.enrollment.dto.SectionDTO;
import com.hcentive.poc.enrollment.service.EnrollmentService;

@Controller
@RequestMapping("/enrollment")
public class EnrollmentController {
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody EnrollmentDTO getEnrollmentInformation(){
		return EnrollmentService.getEnrollment();
	}
	
	//This is a get method because the state of application doesn't change here.
	@RequestMapping(method=RequestMethod.GET, value="currentSection")
	public @ResponseBody SectionDTO getCurrentSection(){
		return EnrollmentService.getCurrentSection();
	}
	@RequestMapping(method=RequestMethod.POST)
	public @ResponseBody Object submitEnrollmentInformation(@Valid EnrollmentDTO enrollmentDTO, BindingResult result){
		if(result.hasErrors()){
			//Status code of 400 has to be thrown here
			return result.getAllErrors();
		}
		else{
			//Status code of 200 has to be thrown here
			return EnrollmentService.getNextSection();
		}
	}
	
	
	//This is a post method because the state of application changes here.
	@RequestMapping(method=RequestMethod.POST, value="previousSection")
	public @ResponseBody SectionDTO getPreviousSection(){
		return EnrollmentService.getPreviousSection();
	}
	
	@RequestMapping(value="{section}",method=RequestMethod.GET)
	public String getSection(@PathVariable String section){
		return "enrollment/"+section;
	}
	
	

}
