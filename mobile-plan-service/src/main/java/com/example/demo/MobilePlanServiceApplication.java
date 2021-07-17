package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.MobilePlan;

@SpringBootApplication
public class MobilePlanServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =
				SpringApplication.run(MobilePlanServiceApplication.class, args);
		
		MobilePlan plan1= ctx.getBean("mobilePlan", MobilePlan.class);		
		System.out.println(plan1);
		
		MobilePlan plan2= ctx.getBean("mobilePlan", MobilePlan.class);		
		System.out.println(plan2);
		
		System.out.println("Singleton:"+ ctx.isSingleton("mobilePlan"));
		System.out.println("Prototype:"+ctx.isPrototype("mobilePlan"));
	}

	@Bean
	public MobilePlan prePaid() {
		return new MobilePlan(111, "wfh" , 500, 30);
	}
	
	@Bean
	public MobilePlan postPaid() {
		return new MobilePlan(222, "jiophn" , 100, 20);
	}
}
