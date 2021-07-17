package com.firstone;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting gr=new Greeting();
		System.out.println(gr.getGreeting());
		Greeting gr1=new Greeting();
		System.out.println(gr1.getGreeting("John"));
		System.out.println(gr1.getGreeting(args[0]));

	}

}
