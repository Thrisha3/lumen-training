package com.training;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*; 

public class BuiltinFunIf {
	public void usingPredicate() {
		
		Predicate<Double> housingLoan= (salaryPerMonth) -> {
			
			boolean result=false;
			
			if(salaryPerMonth>=30000.00) {
				result=true;
			}
			return result;
			
		};
		System.out.println("Person with salary 50000 is elligible:" +housingLoan.test(50000.00));
		System.out.println("Person with salary 20000 is elligible:" +housingLoan.test(20000.00));
		
	}
	
	
	public void usingConsumer(){
		List<String> names = new ArrayList<>();
		names.add("Ram");
		names.add("John");
		names.add("Steve");
		Consumer<String> print=(String) -> System.out.println(String);
		names.forEach(print);
		
		
		//names.forEach(System.out::println);
	}
	
	
	public void usingFunction() {
		Function<Double,Double> currConverter= (inr) -> inr/70;
		System.out.println("INR to USD:"+currConverter.apply(100.00));
				
	}
	          


public static void main(String args[]) {
	
	BuiltinFunIf obj1= new BuiltinFunIf();
	obj1.usingPredicate();
	obj1.usingConsumer();
	obj1.usingFunction();
}
}
