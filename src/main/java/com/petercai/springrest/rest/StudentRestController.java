package com.petercai.springrest.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petercai.springrest.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	// define endpoint for "/students" 
	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> theStudents = new ArrayList<>();
		theStudents.add(new Student("User", "One"));
		theStudents.add(new Student("User", "Two"));
		theStudents.add(new Student("User", "Three"));
		return theStudents;
	}
}
