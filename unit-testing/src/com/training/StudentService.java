package com.training;

public class StudentService {
	
	public String assignGrade(int marks) {
		
		String grade = null;
		 if(marks<60) {
			 grade="B";
		 }
		 else if(marks>=60 && marks<=80){
			 grade="A";	 
			 
		}
		 else {
			 grade="O";
			 
		 }
		 return grade;
	}

	
}
