package com.firstone;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice tv = new Invoice();
		tv.setInvoiceNumber(55);
		tv.setRatePerUnit(25000.00);
		tv.setQuantity(2);
		System.out.println("Price of TV :"+tv.calculate());
		
		
		Invoice fridge = new Invoice();
		fridge.setInvoiceNumber(64);
		fridge.setRatePerUnit(-2000.00);
		fridge.setQuantity(5);
		System.out.println("Price of fridge :"+fridge.calculate());

	}

}
