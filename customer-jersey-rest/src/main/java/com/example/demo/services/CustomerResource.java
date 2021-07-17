package com.example.demo.services;

import com.example.demo.model.Customer;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("Customers")
public class CustomerResource {
	
	CustomerService service= new CustomerService();
	
	
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<Customer> getAllCustomers(){
			
			//CustomerService service= new CustomerService();
			return service.getAllCustomers();
		
	}
		@GET
		@Path("{custId}")
		@Produces(MediaType.APPLICATION_JSON)
		public Customer getCustomerById(@PathParam("custId") int custId) {
			
			return service.getCustomerById(custId);
		}
		
	  @POST
	  @Consumes(MediaType.APPLICATION_JSON)
	  @Produces(MediaType.APPLICATION_JSON)
	  public Response addCustomer(Customer cust){
		
	
		boolean isAdded= this.service.add(cust);
		
		if(isAdded) {
		   return Response.status(201).entity(cust).build();
		}else {
			throw new RuntimeException("Not Added");
			
		}

	}
}
