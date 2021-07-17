package com.training.interfaces;

import java.util.ArrayList;
import java.util.List;

public class InvoiceService implements CrudRepository<Invoice> {
	
    private List<Invoice> invoiceList;
    
     public InvoiceService() {
		super();
		// TODO Auto-generated constructor stub
		this.invoiceList=new ArrayList<>();
	}

	
	@Override
	public boolean save(Invoice inv) {
		// TODO Auto-generated method stub
		return this.invoiceList.add(inv);
	}

	

	@Override
	public List<Invoice> findAll() {
		// TODO Auto-generated method stub
		return this.invoiceList;
	}
	

}
