package com.unosquare.learning.instructorservice.service;

import java.util.List;

import com.unosquare.learning.commons.learningcommons.model.entity.Instructor;

public interface InstructorService {

	public List<Instructor> findAll();

	public Instructor findById(Long id);

	public Instructor save(Instructor instructor);

	public void delete(Long id);
}
