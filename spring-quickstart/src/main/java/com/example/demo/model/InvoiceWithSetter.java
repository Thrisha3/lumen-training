package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Data
@Component("inv2")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString

public class InvoiceWithSetter {
	
	

	private Customer cust;
	
	
	@Autowired
	private Product prod;
	
	
	@Autowired
	public void setCustomer(@Qualifier("ram")   Customer cust) {
		this.cust=cust;
	}
	
}
