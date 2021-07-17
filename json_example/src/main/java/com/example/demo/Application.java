package com.example.demo;



public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student stu1= new Student(12, "Ram",85);
     JsonParsing jp=new JsonParsing();
     System.out.println("JSON:" +jp.javaToJson(stu1));
    String str1="{ \"rollno\": 12,\"studentName\": \"Ram\", \"marks\": 85.0}";
    System.out.println("Java:" +jp.javafromJson(str1));
	}

}
