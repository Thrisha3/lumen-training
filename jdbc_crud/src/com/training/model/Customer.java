package com.training.model;

public class Customer<T> implements Comparable<T> {
	public int id;
	public String customerName;
	private String email;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Customer(int id, String customerName, String email) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.email = email;
	}


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + ", email=" + email + "]";
	}
	

}
