package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable lam=() -> {
			for(int i = 1;i<=5;i++)
			{
				System.out.println("Hi Lambda");
				}
			};
			Thread t=new Thread(lam);
			t.start();

	}

}
