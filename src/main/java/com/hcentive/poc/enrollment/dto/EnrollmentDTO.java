package com.hcentive.poc.enrollment.dto;

import java.util.List;

public class EnrollmentDTO {
	
	private ApplicantInformationDTO self;
	
	private ApplicantInformationDTO spouse;
	
	private List<ApplicantInformationDTO> dependents;

	public ApplicantInformationDTO getSelf() {
		return self;
	}

	public void setSelf(ApplicantInformationDTO self) {
		this.self = self;
	}

	public ApplicantInformationDTO getSpouse() {
		return spouse;
	}

	public void setSpouse(ApplicantInformationDTO spouse) {
		this.spouse = spouse;
	}

	public List<ApplicantInformationDTO> getDependents() {
		return dependents;
	}

	public void setDependents(List<ApplicantInformationDTO> dependents) {
		this.dependents = dependents;
	}
	
	
	
	

}
