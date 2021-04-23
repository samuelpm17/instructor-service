package com.unosquare.learning.instructorservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unosquare.learning.commons.learningcommons.model.entity.Instructor;
import com.unosquare.learning.instructorservice.service.InstructorService;

@RestController
@RequestMapping("/instructors")
public class InstructorController {

	private InstructorService instructorService;

	@Autowired
	public InstructorController(InstructorService instructorService) {
		this.instructorService = instructorService;
	}

	@PostMapping("/create")
	public Instructor create(@RequestBody Instructor instructor) {
		return instructorService.save(instructor);
	}

	@GetMapping("/list")
	public List<Instructor> list() {
		return instructorService.findAll();
	}

	@GetMapping("/list/{id}")
	public Instructor findById(@PathVariable Long id) {
		return instructorService.findById(id);
	}

	@DeleteMapping("/delete/{id]")
	public void delete(@PathVariable Long id) {
		instructorService.delete(id);
	}
}
