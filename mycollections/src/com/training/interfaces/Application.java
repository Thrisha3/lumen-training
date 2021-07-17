package com.training.interfaces;

import java.util.HashSet;
import java.util.List;

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
		fridge.setRatePerUnit(2000.00);
		fridge.setQuantity(5);
		System.out.println("Price of fridge :"+fridge.calculate());
		
		
		InvoiceService service = new InvoiceService();
		service.save(tv);
		service.save(fridge);
		List<Invoice> List= service.findAll();
		for(Invoice eachElement:List) {
			System.out.println(eachElement);
		}
		
		HashSet<Invoice> set=new HashSet<>();
		System.out.println(set.add(fridge));
		System.out.println(set.add(tv));
		System.out.println(set.add(fridge));
		System.out.println(set);
		System.out.println(set.size());
		
		
		
		
	}

}
