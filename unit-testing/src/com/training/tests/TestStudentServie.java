package com.training.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import com.training.StudentService;

public class TestStudentServie {
	
	StudentService service;
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Called Every Time before test method");
		
		service = new StudentService();
	}
	
	
		@Test
	  public void testForNotNull() {
			//StudentService service= new StudentService();
			
			String actual =service.assignGrade(95);
			
			assertNotNull(actual);
			
		}
		
		@Test
		public void testForGrade() {
			//StudentService service= new StudentService();
			
			String actual1 =service.assignGrade(60);
			
			assertEquals("A",actual1);
			
		}
	

}
