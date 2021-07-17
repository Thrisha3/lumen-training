package com.trianing;
import org.apache.log4j.Logger;



import java.util.*;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=Logger.getRootLogger();
	       log.info("Info logged");
		System.out.println("Enter  a number:");
        Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         log.info("You entered correct number:" +number);
         if(number > 100) {
             log.error("You entered a wrong number!");
             sc.close();
             throw new RuntimeException("Wrong Number");   
	}else {
        log.debug("Correct number");
    }sc.close();

	}
}
