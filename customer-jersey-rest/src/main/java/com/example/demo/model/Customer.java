package com.example.demo.model;

public class Customer {

	private int custId;
	private String custName;
	private double custPhn;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String custName, double custPhn) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custPhn = custPhn;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getCustPhn() {
		return custPhn;
	}
	public void setCustPhn(double custPhn) {
		this.custPhn = custPhn;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custPhn=" + custPhn + "]";
	}
	
	
}
