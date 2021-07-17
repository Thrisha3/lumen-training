package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Customer;

import lombok.Data;

@Component
@Data
public class CustomerService {
	
	
	@Autowired
	List<Customer> custList;
}
