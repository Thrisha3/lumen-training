package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonParsing {
	public String javaToJson(Student stu) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create(); 
		return gson.toJson(stu);

		
	}
	//String str="{ \"rollno\": 12,\"studentName\": \"Ram\", \"marks\": 85.0}";
	public Student javafromJson(String str) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create(); 
		
		return gson.fromJson(str,Student.class);
	}
	

	
}
