package com.hcentive.poc.enrollment.service;

import com.hcentive.poc.enrollment.dto.EnrollmentDTO;
import com.hcentive.poc.enrollment.dto.SectionDTO;

public class EnrollmentService {
	
	private static EnrollmentDTO enrollment = new EnrollmentDTO();
	
	private static String[] sections = new String[]{"welcome","1","2","3","thanks"}; 
			
	private static Integer section = 0;
	
	public static EnrollmentDTO getEnrollment(){
		return enrollment;
	}
	
	public static SectionDTO getNextSection(){
		section++;
		return getSectionDTO(section);
	}
	
	public static SectionDTO getPreviousSection(){
		section--;
		return getSectionDTO(section);
	}
	
	private static SectionDTO getSectionDTO(Integer section){
		SectionDTO sectionDTO = new SectionDTO();
		if(section < sections.length){
			sectionDTO.setSection(sections[section]);
			sectionDTO.setFirst(section == 0);
			sectionDTO.setLast(section == sections.length -1);
		}
		return sectionDTO;
	}
	
	public static SectionDTO getCurrentSection(){
		return getSectionDTO(section);
	}

}
