package com.example.demo;
import com.example.demo.model.Customer;
import com.example.demo.model.Invoice;
import com.example.demo.model.InvoiceWithSetter;
import com.example.demo.model.Product;
import com.example.demo.service.CustomerService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.model.Product;

@SpringBootApplication
public class SpringQuickstartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =   
				SpringApplication.run(SpringQuickstartApplication.class, args);
		
		Product prod1= ctx.getBean("tv",Product.class);
		System.out.println(prod1);
		
		Product prod2= ctx.getBean("fridge",Product.class);
		System.out.println(prod2);
		
	Invoice inv =ctx.getBean(Invoice.class);
		System.out.println(inv);
//		
		InvoiceWithSetter invWS = ctx.getBean(InvoiceWithSetter.class);
		System.out.println(invWS);
//		
         CustomerService service= ctx.getBean(CustomerService.class);
		service.getCustList().forEach(System.out::println);
		
		
		ctx.close();
		
	}
	
	
	@Bean
	@Primary
	public Product tv()
	{
		return new Product(1303,"Samsung",50000.00);
	}
	

	@Bean
	public Product fridge()
	{
		return new Product(1505,"LG",24000.00);
	}
	
	@Bean
	@Primary
	public Customer ram() {
		return new Customer(121,"Ram",854762);
	}
	
	@Bean
	public Customer zack() {
		return new Customer(131,"Zack",675482);
	}
	@Bean
	public Customer jonas() {
		return new Customer(141,"Jonas",785915);
	}



}

