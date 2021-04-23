package com.unosquare.learning.instructorservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unosquare.learning.commons.learningcommons.model.entity.Instructor;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor, Long> {

}
