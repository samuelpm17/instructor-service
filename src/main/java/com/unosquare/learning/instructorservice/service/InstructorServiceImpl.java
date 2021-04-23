package com.unosquare.learning.instructorservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unosquare.learning.commons.learningcommons.model.entity.Instructor;
import com.unosquare.learning.instructorservice.repository.InstructorRepository;

@Service
public class InstructorServiceImpl implements InstructorService{

	private InstructorRepository instructorRepository;
	
	@Autowired
	public InstructorServiceImpl(InstructorRepository instructorRepository) {
		this.instructorRepository = instructorRepository;
	}

	@Override
	public List<Instructor> findAll() {
		return (List<Instructor>) instructorRepository.findAll();
	}

	@Override
	public Instructor findById(Long id) {
		return instructorRepository.findById(id).orElse(null);
	}

	@Override
	public Instructor save(Instructor instructor) {
		return instructorRepository.save(instructor);
	}

	@Override
	public void delete(Long id) {
		instructorRepository.deleteById(id);
	}

}
