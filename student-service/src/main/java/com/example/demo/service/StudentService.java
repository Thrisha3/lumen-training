package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

@Service
public class StudentService {

	Map<Integer, Student> map;

	public StudentService() {
		super();
		// Map<Integer, Student> map;
		map = new HashMap<>();
		init();
	}

	public void init() {
		map.put(111, new Student(111, "Robert", "CSE"));
		map.put(222, new Student(222, "John", "ECE"));
		map.put(333, new Student(333, "Charlie", "EEE"));
	}

	public Student getStudent(int rollNumber) {
		return this.map.get(rollNumber);
	}

}
