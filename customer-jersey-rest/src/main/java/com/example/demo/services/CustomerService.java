package com.example.demo.services;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Customer;

public class CustomerService {
	
	private List<Customer> custList; 
	
	
	public CustomerService() {
		super();
		custList =new ArrayList<Customer>();
		init();
		
		
	}
	
	private void init()
	{
		this.custList.add(new Customer(101,"Ram",8654321));
		this.custList.add(new Customer(102,"John",956845));
		
	}
	public boolean add(Customer cust) {
		return this.custList.add(cust);
		
	}
	
	
	public Customer getCustomerById(int custId) {
		
		Customer cust=null;
	
		
		Optional<Customer> resp =this.custList.stream().filter(c -> c.getCustId()==custId).findFirst();
		
		if(resp.isPresent()) {
			cust=resp.get();
		}else {
			throw new RuntimeException("Not found");
		}
		return cust;
	}
	public List<Customer> getAllCustomers(){
		
		return this.custList;
	}
	

	

	
}
