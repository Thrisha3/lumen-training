package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Invoice {
	
	Product prod;
	
	Customer cust;
	
	@Autowired
	public Invoice(@Qualifier("tv") Product prod, @Qualifier("ram") Customer cust) {
		super();
		this.prod = prod;
		this.cust = cust;
	}
	

}
