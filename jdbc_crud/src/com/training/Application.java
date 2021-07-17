package com.training;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import com.training.interfaces.*;
import com.training.jdbc.CustomerRepositoryImpl;
import com.training.model.Customer;
import com.training.utils.DbConnection;

public class Application {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Connection con= DbConnection.getOracleConnection();
		CustomerRepositoryImpl cust1= new CustomerRepositoryImpl(con);
		int ch=2;
		try {
			if(ch==1) {
				cust1.add(new Customer(101,"Ram", "ram@gmail.com"));
				cust1.add(new Customer(102,"Raj", "raj@gmail.com"));
				cust1.add(new Customer(103,"John","john@gmail.com"));
				cust1.add(new Customer(104,"Sham", "sham@gmail.com"));
				System.out.println(cust1);
				
			}
			if(ch==2) {
				List<Customer> list =cust1.findAll();
				for (Customer eachCustomer:list) {
					System.out.println(eachCustomer);
					
				}
			}if(ch==3) {
				System.out.println(cust1.findById(101));
				
			}
			if(ch==4) {
				System.out.println(cust1.remove(102));
				
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
   
	}

}
