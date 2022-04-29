package com.infy.infyinterns.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;

import com.infy.infyinterns.dto.MentorDTO;
import com.infy.infyinterns.dto.ProjectDTO;
import com.infy.infyinterns.exception.InfyInternException;

public class ProjectAllocationServiceImpl implements ProjectAllocationService {

	@Override
	public Integer allocateProject( @Valid @RequestBody ProjectDTO project) throws InfyInternException {

		//throw new InfyInterException("Service.CANNOT_ALLOCATE_PROJECT");
		return null;
	}

	
	@Override
	public List<MentorDTO> getMentors(Integer numberOfProjectsMentored) throws InfyInternException {
		return null;
	}


	@Override
	public void updateProjectMentor(Integer projectId, Integer mentorId) throws InfyInternException {
		
	}

	@Override
	public void deleteProject(Integer projectId) throws InfyInternException {
		
	}
}