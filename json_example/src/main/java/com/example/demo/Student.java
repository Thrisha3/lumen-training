package com.example.demo;

public class Student {

		
	
		// TODO Auto-generated method stubno
		private int rollno;
		private String studentName;
		private double marks;
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public double getMarks() {
			return marks;
		}
		public void setMarks(double marks) {
			this.marks = marks;
		}
		public Student(int rollno, String studentName, double marks) {
			super();
			this.rollno = rollno;
			this.studentName = studentName;
			this.marks = marks;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", studentName=" + studentName + ", marks=" + marks + "]";
		}

}
