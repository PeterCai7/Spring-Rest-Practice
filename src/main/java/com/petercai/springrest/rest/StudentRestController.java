package com.petercai.springrest.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petercai.springrest.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> theStudents;
	
	//define @PostConstruct to load data
	@PostConstruct
	public void loadData() {
		theStudents = new ArrayList<>();
		theStudents.add(new Student("User", "One"));
		theStudents.add(new Student("User", "Two"));
		theStudents.add(new Student("User", "Three"));
	}
	
	// define endpoint for "/students" 
	@GetMapping("/students")
	public List<Student> getStudents() {
		return theStudents;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		//keep it simple for now
		
		return theStudents.get(studentId);
	}
	
}
